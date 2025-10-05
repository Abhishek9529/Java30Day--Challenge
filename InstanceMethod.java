public class Main {
// An instance method in Java is a function defined within a class that operates on a specific instance (or object) of that class.
	void printName(String name) {
		System.out.println("Hello, " + name);
	}
	public static void main(String[] args) {
		Main mn = new Main();
		mn.printName("John");
	}
}