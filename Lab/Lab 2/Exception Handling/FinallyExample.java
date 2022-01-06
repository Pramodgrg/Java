public class FinallyExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        try{
            c = a/b;
            System.out.println("The output is :"+c);
        }catch(ArithmeticException e){
            System.out.println("Error message: "+ e.getMessage());
        }
        finally{
            System.out.println("Using Finally");
        }
    }
}