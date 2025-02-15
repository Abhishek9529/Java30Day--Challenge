public class Main {
	public static int sum(int a, int b)
	{
	    return a+b;
	}
	public static void printMessege(){
	    System.out.println("Hello, java! ");
	}
	
	public static void main(String[] args) {
	    //function in java 
	    int a  =10, b = 20;
	    int add = sum(a,b);
	    System.out.println("Addition : " + add);
	    
	    printMessege();
	}
}