package chapter.one;

public enum AEnum {
	A(1), B(2), C("C as String");
	private final Integer i;
	private String s;

	private AEnum(int i) {
		this.i = i;
	}
	
	/**
	 * Ist implizit "private". †berlŠdt den anderen Constructor (Overloading).
	 * 
	 * @param s
	 */
	AEnum(String s) {
		this.s = s;
		this.i = null;
	}

	public int getI() {
		return i;
	}
	
	public String getS() {
		return s;
	}
}
