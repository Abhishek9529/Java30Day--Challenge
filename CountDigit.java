public class CountDigit {
	// this program find the power of the given a on digit of the given num 
	public static void main(String[] args) {
		int num = 1234;
		int a = 3;
		int count = 0;
		while(num >0){
		num = num / 10;
		count ++;
		}
		int cube = 1;
		System.out.println(count);
		for (int i =1; i <= count; i++){		    
		    cube *= a;	    
		}
		System.out.println(cube);
	}
}