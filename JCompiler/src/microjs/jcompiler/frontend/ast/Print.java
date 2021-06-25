package microjs.jcompiler.frontend.ast;




import java_cup.runtime.ComplexSymbolFactory.Location;
import microjs.jcompiler.middleend.kast.KPrint;
import microjs.jcompiler.middleend.kast.KStatement;
import microjs.jcompiler.utils.DotGraph;

public class Print extends Statement {
    private Expr e;
	public Print(Expr e,Location startPos, Location endPos) {
		super(startPos, endPos);
		// TODO Auto-generated constructor stub
		this.e=e;
	}

	@Override
	public KStatement expand() {
		// TODO Auto-generated method stub
		return new KPrint(e.expand(),getStartPos(),getEndPos());
	}

	@Override
	protected String buildDotGraph(DotGraph graph) {
		// TODO Auto-generated method stub
		String printNode = graph.addNode("Print(");
		String exprNode = e.buildDotGraph(graph)+")";
		String ret=printNode+exprNode;
		graph.addEdge(printNode, exprNode, "expr");
		
		return ret;
	}

	public Expr getE() {
		return e;
	}

	@Override
	protected void prettyPrint(StringBuilder buf, int indent_level) {
		// TODO Auto-generated method stub
		buf.append("print(");
		e.prettyPrint(buf);
		buf.append(")");
	}

}
