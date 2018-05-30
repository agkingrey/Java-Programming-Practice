//Austin Kingrey
public class NumDemo {

	public static void main(String[] args) {
	//Here I will initialize all of my variables.
		int exampleInt = 5;
		byte exampleByte = 125;
		short exampleShort = (short) 123456;
		long exampleLong = 12345678289l;
		double exampleDouble = 5.3794;
		float exampleFloat = (float) -4.53;
		char b = 'a';
	//Now I'll print them
		System.out.println("aInt    =" +exampleInt);
		System.out.println("aByte   =" +exampleByte);
		System.out.println("aShort  =" +exampleShort);
		System.out.println("aLong   =" +exampleLong);
		System.out.println("aDouble =" +exampleDouble);
		System.out.println("aFLoat  =" +exampleFloat);
		System.out.println("aChar   =  " +b);
	//Now for the Constants
		final int EX_INT = 4;
		final byte EX_BYTE = 123;
		final short EX_SHORT = (short) 45739;
		final double EX_DOUBLE = 5.2343;
		final long EX_LONG = 33282301789234l;
		final float EX_FLOAT = (float) -345345.343;
		final char EX_C = 'b';
	// And we're printing again
		System.out.println("aConstantInt    =" +EX_INT);
		System.out.println("aConstanttByte  =" +EX_BYTE);
		System.out.println("aConstantShort  =" +EX_SHORT);
		System.out.println("aConstantDouble =" +EX_DOUBLE);
		System.out.println("aConstantLong   =" +EX_LONG);
		System.out.println("aConstantFloat  =" +EX_FLOAT);
		System.out.println("aConstantChar   =  " +EX_C);

	}

}
