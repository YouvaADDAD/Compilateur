package microjs.jcompiler.middleend.kast;

import java.util.ArrayList;
import java.util.List;

import java_cup.runtime.ComplexSymbolFactory.Location;

public class KCons extends KExpr {
    private String name;
    private List<KExpr>list=new ArrayList<>();
	public KCons(String name, List<KExpr> stmt, Location startPos, Location endPos) {
		// TODO Auto-generated constructor stub
		super(startPos,endPos);
		this.name=name;
		list.addAll(stmt);
		
	}

	@Override
	public void accept(KASTVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
		
	}

	public String getName() {
		return name;
	}
	public List<KExpr> getList(){
		return list;
	}

}
