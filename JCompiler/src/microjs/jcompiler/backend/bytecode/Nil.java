package microjs.jcompiler.backend.bytecode;

import microjs.jcompiler.backend.Serializer;

public class Nil extends BCValue {

	@Override
	public int getOpcode() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public String getOpcodeName() {
		// TODO Auto-generated method stub
		return "NIL";
	}

	@Override
	public void genBytecode(Serializer gen) {
		// TODO Auto-generated method stub
		gen.encode(getOpcode());
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 1;
	}

	public String toString() {
		return "NIL";
	};
}
