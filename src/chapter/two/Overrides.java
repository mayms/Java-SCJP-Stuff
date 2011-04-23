package chapter.two;

public class Overrides extends BaseOverrides {
	/*
	 * More restrictive return type and less restrictive access modifier.
	 * 
	 * @see chapter.two.BaseOverrides#doStuff()
	 */
	@Override
	public B doStuff(A param) {
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