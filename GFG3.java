public class GFG3 {
    public static void methodOne() { 
		// Defining Method2() in Method1() 
		methodTwo(); 
	} 
	// Method2() 
	public static void methodTwo() 
	{ 
		// Calling method1 in methos2() 
		methodOne(); 
	} 
	public static void main(String[] args) { 
		// Calling method1() in main() 
		methodOne();
 }

}
