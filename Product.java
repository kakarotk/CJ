public class Product {
    public int multiply(int a, int b){
        int prod=a*b;
        return prod;
    }

    public int multiply(int a , int b , int c){
        int prod= a*b*c;
        return prod;
     }

     public static void main(String[] args) {
        Product ob = new Product();
        System.out.println("Product of 2 numbers "+ ob.multiply(10, 11));

        Product ob1= new Product();
        System.out.println("Product of 3 numbers: "+ob1.multiply(10, 20, 30));
     }
}
