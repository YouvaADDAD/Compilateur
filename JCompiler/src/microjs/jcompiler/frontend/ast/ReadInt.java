package microjs.jcompiler.frontend.ast;

import java.util.ArrayList;
import java.util.List;

import java_cup.runtime.ComplexSymbolFactory.Location;
import microjs.jcompiler.middleend.kast.KCall;
import microjs.jcompiler.middleend.kast.KEVar;
import microjs.jcompiler.middleend.kast.KExpr;
import microjs.jcompiler.utils.DotGraph;

public class ReadInt extends Expr {
	public ReadInt(Location startPos, Location endPos) {
		super(startPos, endPos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public KCall expand() {
		// TODO Auto-generated method stub
		List<KExpr> stmt=new ArrayList<KExpr>();
		return new KCall(new KEVar("readInt",getStartPos(), getEndPos()),stmt,getStartPos(), getEndPos());
	}

	@Override
	protected void prettyPrint(StringBuilder buf) {
		// TODO Auto-generated method stub
		buf.append("readInt()");
	}

	@Override
	protected String buildDotGraph(DotGraph graph) {
		// TODO Auto-generated method stub
		String ReadNode = graph.addNode("readInt()");
		return ReadNode;
	}

}
