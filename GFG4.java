import java.io.*; 
public class GFG4 {
    public static void main(String[] args) 
	{ 
		// ParseInt() takes integer value as parameter 
		// other values 
		// valid 
		int i = Integer.parseInt("50"); 
		// invalid 
		// forInputString(A) 
		// NumberFormatException will be thrown 
		int j = Integer.parseInt("A"); 
		// invalid 
		// forInputString(five) 
		// NumberFormatException will be thrown 
		int k = Integer.parseInt("five"); 
	} 

}
