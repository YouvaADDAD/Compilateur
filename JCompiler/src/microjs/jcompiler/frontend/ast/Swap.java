package microjs.jcompiler.frontend.ast;

import java_cup.runtime.ComplexSymbolFactory.Location;
import microjs.jcompiler.middleend.kast.KStatement;
import java.util.ArrayList;
import microjs.jcompiler.utils.DotGraph;


public class Swap extends Statement {
    private String g;
    private String d;

    public Swap(String g, String d, Location startPos, Location endPos) {
      super(startPos, endPos);
      this.g = g;
      this.d = d;
    }

    @Override
    public KStatement expand() {
      String tmp                 = "%tmp%";
      ArrayList<Statement> stmts = new ArrayList<Statement>();
      
      stmts.add(new Assign(g,
			   new EVar(d, getStartPos(), getEndPos()),
			   getStartPos(), getEndPos()));
      stmts.add(new Assign(d,
			   new EVar(tmp, getEndPos(), getEndPos()),
			   getEndPos(), getEndPos()));

      Let l = new Let(tmp,
		      new EVar(g, getStartPos(), getEndPos()),
		      stmts,
		      getStartPos(), getEndPos());
      
      return l.expand();
    }

    
    @Override
    protected String buildDotGraph(DotGraph graph) {
	return graph.addNode("Swap[" + g + " , " + d + "]");
    }


    @Override
    protected void prettyPrint(StringBuilder buf, int indent_level) {
      indent(buf, indent_level);
      buf.append(g + " <-> " + d);
    }
}
