package language.basics;

public class DataTypes {
	public static void main(String Args[]) {
		// primitive Data types
		// integer data type
		byte marks = 100; // -128 to 127

		short id = 8454; // -32768 to 32767 (-2^15 to 2^15-1)

		int pincode = 845435; // (-2^31 to 2^31-1)
		long mobile = 9892236734l; // (-2^63 to 2^63-1)

		// Floating type data type
		float percent = 89.4f;
		double latitude = 56.0234342343;

		// Boolean type data type
		boolean boo = true;

		// Char type data type
		char grade = 'A';
		char asciiValueOfA = 65;

		// Non-Primitive Data type
		String name = "894353248965893469865sdfghsdjghdsfjhgdkj&*^QW(*^Q$(%*^%)^)(^%Q)(";

		System.out.println("byte Marks is " + marks);

		System.out.println("short id is " + id);
		System.out.println("int pincode is " + pincode);
		System.out.println("long mobile is " + mobile);
		System.out.println("float percent is " + percent);
		System.out.println("double latitude is " + latitude);

		System.out.println("boolean boo is " + boo);

		System.out.println(marks + id + pincode);

		System.out.println("This is char >> asciiValueOfA is : " + asciiValueOfA);
		System.out.println("This is char >> Grade : " + grade);
		System.out.println("This is String >>" + name);

	}

}
