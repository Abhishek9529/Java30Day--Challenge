
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Strings are used for storing text.
    // A String variable contains a collection of characters surrounded by double quotes:
    // System.out.println("Enter Your Name : ");
    // String name = sc.nextLine();
    // String name = "abhi";
    // System.out.print("Hello " + name);

    // Length()
    // System.out.println("Length : " + name.length());

    // There are many string methods available, for example toUpperCase() and toLowerCase():
    // System.out.println("in Uppercase : "+name.toUpperCase());
    // System.out.println("in Lowercase : "+name.toLowerCase());
    

    // The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
    // String txt = "java is a very easy language";
    // System.out.println(txt.indexOf("easy"));

    //If you add two strings, the result will be a string concatenation:
    //String str1 = "20"; 
    //String str2 = "25";
    //System.out.println(str1 + str2); 

    //Strings - Special Characters		
    //System.out.println(" java is  \"very\"  easy  ");    
    
    //The sequence \'  inserts a single quote in a string:
    //System.out.println("java is  \'very\' easy  ");
    
    //The sequence \\  inserts a single backslash in a string:
    //System.out.println("java is \\very\\ easy ");
   	
    // sub string in string
	//String name = "javascript";
	//System.out.println(name.substring(0,4)); 

        // string comparison
	/** String str1 = "java";
	String str2 = "javascript";
	if(str1.equals(str2)){
	    System.out.println("both strings are same");
	}
	else{
	   System.out.println("both strings are differents"); 
	} 
	 **/
    
// check valid user
//String userName = "rahul", password = "1234";
//System.out.println("Enter your username : ");
//String userInput = sc.nextLine();
//System.out.println("Enter your password  : ");
//String passInput = sc.nextLine();
//if(userInput.equals(userName)  && passInput.equals(password) ){
//    System.out.println("valid user");
//}
//else {
//    System.out.println("invalid user");
//}
    
//You can also use the concat() method to concatenate two strings:
//String str1 = "john";
//String str2 = "Doe";
//System.out.println(str1.concat(str2));

//The charAt() method returns the character at the specified index in a string.
//String str = "java";
//char result = str.charAt(3);
//System.out.println(result);	    

	    
    }
}
