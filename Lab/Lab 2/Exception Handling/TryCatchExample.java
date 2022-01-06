public class TryCatchExample
{  
  public static void main(String args[])
  {  
    int a=1;
    int b=0;
    int c;
    try{
            c= a/b;
            System.out.println("The output is :"+c);
        }catch(ArithmeticException e){
            System.out.println("Error message: "+ e.getMessage());
        }
    }
}