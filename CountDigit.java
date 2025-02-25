public class CountDigit {
	public static int countNumber(int num){
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count ++;
		}
		return count;
	}

	public static int armstrong(int num){
		int count = countNumber(Math.abs(num));
		int digit = 0, total = 0, temp = Math.abs(num);
		while (temp > 0) {
			int power = 1;
			digit = temp % 10;
			for (int i =1; i <= count; i++){
			power *= digit;
			}
			total += power;
			temp = temp / 10;
		}
		return total;
	}
	public static void main(String[] args) {
		int num = -9474;
		int result = armstrong(num);
		if (result == Math.abs(num)) {
			System.out.println(num + " is an  Armstrong Number,  total : " + result );
		}else{
			System.out.println(num + " is not an Armstrong Number,  total : " + result );
		}
	}
}