package microjs.jcompiler.middleend.kast;


import java_cup.runtime.ComplexSymbolFactory.Location;

public class KPrint extends KStatement {
    private KExpr expr;
	public KPrint(KExpr expr,Location startPos, Location endPos) {
		super(startPos, endPos);
		// TODO Auto-generated constructor stub
		this.expr=expr;
	}

	@Override
	public void accept(KASTVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	public KExpr getExpr() {
		return expr;
	}

	

}
