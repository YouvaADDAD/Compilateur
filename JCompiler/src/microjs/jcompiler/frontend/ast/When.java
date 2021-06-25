package microjs.jcompiler.frontend.ast;

import java.util.List;
import java_cup.runtime.ComplexSymbolFactory.Location;
import microjs.jcompiler.middleend.kast.KIf;
import microjs.jcompiler.middleend.kast.KSeq;
import microjs.jcompiler.middleend.kast.KStatement;
import microjs.jcompiler.utils.DotGraph;

public class When extends Statement {
    private Expr cond;
    private List<Statement> corps;
    
    public When(Expr cond, List<Statement> corps, Location startPos, Location endPos) {
    	super(startPos, endPos);		
    	this.cond = cond;
    	this.corps = corps;
    }
    
    @Override
    public KIf expand() {
    	// then part
    	Location thenStartPos = getStartPos(); // XXX: good approximation ?
    	Location thenEndPos = getStartPos();
    	List<KStatement> kwhen = Statement.expandStatements(corps);
    	KStatement kwhens = KSeq.buildKSeq(kwhen, thenStartPos, thenEndPos);
    	return new KIf(cond.expand(), kwhens,null,getStartPos(), getEndPos());
    }
    
	@Override
	protected String buildDotGraph(DotGraph graph) {
		String ifNode = graph.addNode("When");
		String condNode = cond.buildDotGraph(graph);
		graph.addEdge(ifNode, condNode, "cond");
		String thenNode = cond.buildDotGraph(graph);
		graph.addEdge(ifNode, thenNode, "Corps");
		return ifNode;
	}
    
    @Override
    protected void prettyPrint(StringBuilder buf, int indent_level) {
    	indent(buf, indent_level);
    	buf.append("when (");
    	cond.prettyPrint(buf);
    	buf.append(") {\n");
    	Statement.prettyPrintStatements(buf, corps, indent_level + 1);
    	indent(buf, indent_level);
    }
}
