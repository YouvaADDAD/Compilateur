package microjs.jcompiler.middleend.kast;

import java_cup.runtime.ComplexSymbolFactory.Location;

public class KNil extends KExpr {

	public KNil(Location startPos, Location endPos) {
		super(startPos, endPos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(KASTVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
