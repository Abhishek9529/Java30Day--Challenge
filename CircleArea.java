public class CircleArea {
 // its return area of circle
public static float calculateArea(float radius){
    return (float)(Math.PI * radius * radius);
}
	public static void main(String[] args) {
		float  radius = 7.0f;
		float area = calculateArea(radius);
		System.out.printf("%.5f%n",area);
	}
}