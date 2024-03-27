public class Product2 {
    public int multiply(int a, int b){
        int prod=a*b;
        return prod;
    }

    public double  multiply(double a , double b , double c){
        double prod= a*b*c;
        return prod;
     }

     public static void main(String[] args) {
        Product2 ob = new Product2();
        System.out.println("Product of 2 numbers "+ ob.multiply(10, 11));

        Product2 ob1= new Product2();
        System.out.println("Product of 3 numbers: "+ob1.multiply(10, 20, 30));
     } 
}
