public class Main {
	public static boolean  isPrime(int num) {
     if (num == 2){
      return true ;
     }
      if (num % 2 == 0 || num <= 1){
    return  false;
       }
   for (int i = 3; i <= Math.sqrt(num); i += 2){
           if (num % i == 0){
               //System.out.print(num + " "+ i);
               return false  ;
           }
       }
       return true ;
	}
	public static void main(String[] args) {
boolean isprime = isPrime(11);

System.out.println( isprime);
	}
}
