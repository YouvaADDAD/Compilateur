package microjs.jcompiler.frontend.ast;

import java.util.ArrayList;
import java.util.List;

import java_cup.runtime.ComplexSymbolFactory.Location;
import microjs.jcompiler.middleend.kast.KSeq;
import microjs.jcompiler.middleend.kast.KStatement;
import microjs.jcompiler.utils.DotGraph;

public class MultAffect1P extends Statement {
    private String var1;
    private String var2;
	private String p;
	
	public MultAffect1P(String var1,String var2,String p,Location startPos, Location endPos) {
		super(startPos, endPos);
		// TODO Auto-generated constructor stub
		this.var1=var1;
		this.var2=var2;
		this.p=p;
	}

	@Override
	public KStatement expand() {
		// TODO Auto-generated method stub
		List<KStatement> stmt=new ArrayList<>();
		Statement expr=(new Var(var1,new Car2(p,getStartPos(),getEndPos()),getStartPos(),getEndPos()));
		stmt.add(expr.expand());
		expr=(new Var(var2,new Cdr2(p,getStartPos(),getEndPos()),getStartPos(),getEndPos()));
		stmt.add(expr.expand());
		return new KSeq(stmt,getStartPos(),getEndPos());
	}

	@Override
	protected void prettyPrint(StringBuilder buf, int indent_level) {
		// TODO Auto-generated method stub
		indent(buf, indent_level);
		buf.append("var ");
    	buf.append(var1);
    	buf.append(",");
    	buf.append(var2);
    	buf.append(" = ");
    	buf.append(p);
		
		
	}

	@Override
	protected String buildDotGraph(DotGraph graph) {
		// TODO Auto-generated method stub
		String varNode = graph.addNode("Var[" + var1+","+var2 +"]");
		String exprNode = graph.addNode("= "+p);
		graph.addEdge(varNode, exprNode, "expr");
		return varNode;
	}

}
