package microjs.jcompiler.middleend.kast;

import java_cup.runtime.ComplexSymbolFactory.Location;

public class KCdr2 extends KExpr {
    private String var;
	public KCdr2(String var, Location startPos, Location endPos) {
		// TODO Auto-generated constructor stub
		super(startPos,endPos);
		this.var=var;
	}
	@Override
	public void accept(KASTVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
		
	}
	public String getName() {
		return var;
	}
}
