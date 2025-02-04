// function in java
public class Main {
	public static void main(String[] args) {

                int num1 = 10, square = 0;
		square = squareOfNum(num1);
		System.out.println(square);

		String firstName = "jon", secondName = " doe", fullName = "";
		fullName = concatinate(firstName, secondName);
		System.out.println(fullName);
	}

        // this function return square of number
	public static int squareOfNum(int num) {
		return num * num ;
	}

	// this function return concate string
	public static String concatinate(String  str1, String str2) {
		//System.out.println(str1 + str2);
		return str1 + str2;	
	}
}
