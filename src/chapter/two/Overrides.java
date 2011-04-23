package chapter.two;

public class Overrides extends BaseOverrides {
	/*
	 * More restrictive return type.
	 * 
	 * @see chapter.two.BaseOverrides#doStuff()
	 */
	@Override
	protected B doStuff(A param) {
		return new B();
	}

	// illegal type for parameter
	// @Override
	// protected A doStuff(B param) {
	// return new B();
	// }
}

class BaseOverrides {
	protected A doStuff(A param) {
		return new A();
	}
}

class B extends A {
}

class A {
}