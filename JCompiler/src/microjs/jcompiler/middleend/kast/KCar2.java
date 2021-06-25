package microjs.jcompiler.middleend.kast;

import java_cup.runtime.ComplexSymbolFactory.Location;

public class KCar2 extends KExpr {
    private String name;
	public KCar2(String name,Location startPos, Location endPos) {
		super(startPos, endPos);
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	@Override
	public void accept(KASTVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
		
	}
	public String getName() {
		return name;
	}

}
