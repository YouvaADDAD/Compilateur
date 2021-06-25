package microjs.jcompiler.frontend.ast;

import java_cup.runtime.ComplexSymbolFactory.Location;
import microjs.jcompiler.middleend.kast.KExpr;
import microjs.jcompiler.middleend.kast.KNil;
import microjs.jcompiler.utils.DotGraph;

public class Nil extends Expr {
	
	
	public Nil(Location startPos, Location endPos) {
		super(startPos, endPos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public KExpr expand() {
		// TODO Auto-generated method stub
		return new KNil(getStartPos(), getEndPos());
	}

	@Override
	protected void prettyPrint(StringBuilder buf) {
		// TODO Auto-generated method stub
		buf.append("Nil");
	}

	@Override
	protected String buildDotGraph(DotGraph graph) {
		// TODO Auto-generated method stub
		String nilNode = graph.addNode("Nil[  ]");
		return nilNode;
	}

}
