// function in java
public class Main {
	//A Method with If...Else
static void checkAge(int age){
	if(age < 18)
	{
	System.out.println("Access denied");
	}
	else{
	    	System.out.println("Access granted");
	}
}
	public static void main(String[] args) {

                float fNum1 = 12.0f, fNum2 = 8.0f, total;
		total = sum(fNum1,  fNum2);
		System.out.println(total);

		int num1 = 10, square = 0;
		square = squareOfNum(num1);
		System.out.println(square);


		String firstName = "jon", secondName = " doe", fullName = "";
		fullName = concatinate(firstName, secondName);
		System.out.println(fullName);

		checkAge(20);
	}

// this function return sum of numbers
	public static float sum(float fNum1, float fNum2) {
		return fNum1 + fNum2;
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
