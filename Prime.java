public class Main {
	public static void isPrime(int num) {
     if (num == 2){
      System.out.print(" is prime number...");
      return;
     }
      if (num % 2 == 0 || num <= 1){
    System.out.print(" is not prime number...");
    return ;
       }
   for (int i = 3; i < Math.sqrt(num); i += 2){
           if (num % i == 0){
               System.out.print(" is not prime number...");
               return ;
           }
       }
  System.out.print(" is prime number...");
	}
	public static void main(String[] args) {
isPrime(10);
	}
}