package microjs.jcompiler.frontend.ast;

import java.util.ArrayList;
import java.util.List;

import java_cup.runtime.ComplexSymbolFactory.Location;
import microjs.jcompiler.middleend.kast.KCons;
import microjs.jcompiler.middleend.kast.KExpr;
import microjs.jcompiler.utils.DotGraph;

public class Cons extends Expr {
    private Expr a;
    private Expr b;
	public Cons(Expr a,Expr b,Location startPos, Location endPos) {
		super(startPos, endPos);
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
	}

	@Override
	public KExpr expand() {
		// TODO Auto-generated method stub
		List<KExpr> stmt=new ArrayList<>();
		stmt.add(b.expand());
		stmt.add(a.expand());
		return new KCons("cons",stmt,getStartPos(),getEndPos());
	}

	@Override
	protected String buildDotGraph(DotGraph graph) {
		// TODO Auto-generated method stub
		String consNode = graph.addNode("cons");
		String ExpraNode = a.buildDotGraph(graph);
		graph.addEdge(consNode, ExpraNode, "ExprA");
		String ExprbNode = b.buildDotGraph(graph);
		graph.addEdge(consNode, ExprbNode, "ExprB");
		return consNode;
		
	}
	public Expr getExprA() {
		return a;
	}
	public Expr getExprB() {
		return b;
	}


	@Override
	protected void prettyPrint(StringBuilder buf) {
		// TODO Auto-generated method stub
		buf.append("cons (");
    	a.prettyPrint(buf);
    	b.prettyPrint(buf);
    	buf.append(")");
	}
	
}
