public class CheckEven {
	public static boolean isEven(int num){
	  return num % 2 == 0 ? true : false;  
	}
	public static void main(String[] args) {
	int num = 10;
	System.out.println(isEven(num));
	}
}