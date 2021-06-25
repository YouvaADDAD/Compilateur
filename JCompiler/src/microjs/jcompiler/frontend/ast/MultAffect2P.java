package microjs.jcompiler.frontend.ast;

import java.util.ArrayList;
import java.util.List;

import java_cup.runtime.ComplexSymbolFactory.Location;
import microjs.jcompiler.middleend.kast.KCall;
import microjs.jcompiler.middleend.kast.KClosure;
import microjs.jcompiler.middleend.kast.KExpr;
import microjs.jcompiler.middleend.kast.KReturn;
import microjs.jcompiler.middleend.kast.KStatement;
import microjs.jcompiler.utils.DotGraph;

public class MultAffect2P extends Statement {
	private String var1;
    private String var2;
	private String p;
    private List<Statement> list;
    
	public MultAffect2P(String var1,String var2,String p,List<Statement> list,Location startPos, Location endPos) {
		super(startPos, endPos);
		// TODO Auto-generated constructor stub
		this.var1=var1;
		this.var2=var2;
		this.p=p;
		this.list=list;
	}

		@Override
		public KStatement expand() {
			// TODO Auto-generated method stub
			KStatement expr1=new Let(var2, new Cdr2(p,getStartPos(),getEndPos()), list, getStartPos(), getEndPos()).expand();
			List<String> params=new ArrayList<>();
			params.add(var1);
			KClosure fun2 = new KClosure(params, expr1, getStartPos(), getEndPos());
			List<KExpr> kargs=new ArrayList<>();
	    	kargs.add(new Car2(p,getStartPos(),getEndPos()).expand());
	    	KCall call2=new KCall(fun2, kargs, getStartPos(), getEndPos());
	    	return new KReturn(call2,getStartPos(), getEndPos());
			
		}

		@Override
		protected void prettyPrint(StringBuilder buf, int indent_level) {
			// TODO Auto-generated method stub
			indent(buf, indent_level);
			buf.append("let ");
	    	buf.append(var1);
	    	buf.append(",");
	    	buf.append(var2);
	    	buf.append(" = ");
	    	buf.append(p);
		}

		@Override
		protected String buildDotGraph(DotGraph graph) {
			// TODO Auto-generated method stub
			String letNode = graph.addNode("Let[" + var1+","+var2 + "]");
			String exprNode = graph.addNode("=" + p);
			graph.addEdge(letNode, exprNode, "expr");
			for(int i=0; i<list.size(); i++) {
				Statement st = list.get(i);
				String stRoot = st.buildDotGraph(graph);
				graph.addEdge(letNode, stRoot, "body[" + i + "]");
			}
			return letNode;
		}

}