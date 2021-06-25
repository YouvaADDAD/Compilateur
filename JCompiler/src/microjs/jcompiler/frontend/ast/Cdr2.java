package microjs.jcompiler.frontend.ast;

import java_cup.runtime.ComplexSymbolFactory.Location;
import microjs.jcompiler.middleend.kast.KCdr2;
import microjs.jcompiler.middleend.kast.KExpr;
import microjs.jcompiler.utils.DotGraph;

public class Cdr2 extends Expr {
	private String var;
	public Cdr2(String var,Location startPos, Location endPos) {
		super(startPos, endPos);
		// TODO Auto-generated constructor stub
		this.var=var;
	}


		@Override
		public KExpr expand() {
			// TODO Auto-generated method stub
			return new KCdr2(var,getStartPos(),getEndPos());
		}

		@Override
		protected void prettyPrint(StringBuilder buf) {
			// TODO Auto-generated method stub
			buf.append("cdr (");
	    	buf.append(var);
	    	buf.append(")");
		}

		@Override
		protected String buildDotGraph(DotGraph graph) {
			// TODO Auto-generated method stub
			String carNode = graph.addNode("cdr");
			String varNode = graph.addNode("Var[" + var+"]");
			graph.addEdge(carNode, varNode, "cons");
			return carNode;
		}

}
