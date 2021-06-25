package microjs.jcompiler.frontend.ast;

import java_cup.runtime.ComplexSymbolFactory.Location;
import microjs.jcompiler.middleend.kast.KCdr;
import microjs.jcompiler.middleend.kast.KExpr;
import microjs.jcompiler.utils.DotGraph;

public class Cdr extends Expr {
    private Expr p;
	public Cdr(Expr p,Location startPos, Location endPos) {
		super(startPos, endPos);
		// TODO Auto-generated constructor stub
		this.p=p;
	}

	@Override
	public KExpr expand() {
		// TODO Auto-generated method stub
		return new KCdr(p.expand(),getStartPos(),getEndPos());
	}

	@Override
	protected void prettyPrint(StringBuilder buf) {
		// TODO Auto-generated method stub
		buf.append("cdr (");
    	p.prettyPrint(buf);
    	buf.append(")");
	}

	@Override
	protected String buildDotGraph(DotGraph graph) {
		// TODO Auto-generated method stub
		String carNode = graph.addNode("cdr");
		String consNode = p.buildDotGraph(graph);
		graph.addEdge(carNode, consNode, "Cons");
		return carNode;
	}

}