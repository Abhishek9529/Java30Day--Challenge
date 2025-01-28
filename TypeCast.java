
public class TypeCast {
    public static void main(String[] args) {
        // Java Type Casting
        // Type casting is when you assign a value of one primitive data type to another
        // type.

        // In Java, there are two types of casting:

        // Widening Casting (automatically) - converting a smaller type to a larger type
        // size
        // byte -> short -> char -> int -> long -> float -> double

        // Narrowing Casting (manually) - converting a larger type to a smaller size
        // type
        // double -> float -> long -> int -> char -> short -> byte

        // Widening Casting
        // int intVal = 10;
        // double doubleVal = intVal;
        // System.out.println(doubleVal);
        // System.out.println(intVal);


        // Narrowing Casting
        double doubleVal = 10.0;
        int intVal = (int) doubleVal;
        System.out.println(doubleVal);
        System.out.println(intVal);
    

    }
}
