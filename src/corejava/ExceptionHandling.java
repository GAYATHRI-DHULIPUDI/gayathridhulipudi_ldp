package corejava;
import java.io.IOException;
class ThrowsException{
    public void runThis() throws IOException{

    }
}



public class ExceptionHandling {

    public static void main(String[] args) {
        ThrowsException te=new ThrowsException();
        int arr[]={10,1,0,3};

//        try{
//            //int result=arr[0]/(arr[1]+arr[2]);
//            int result=arr[0]/(arr[1]);
//        }
//        catch(ArithmeticException e){
//            System.out.println("Arithmetic exception");
//        }
//        catch(IndexOutOfBoundsException e){
//            System.out.println("Index out of bounds");
//        }
//        finally {
//            System.out.println("finally method");
//        }
        ;

        try{
            String s=null;
            //te.runThis();
           // int a=Integer.parseInt(" 432");
            //System.out.println(s.toUpperCase());
            //System.out.println(a);
                for(int i=0;i<arr.length;i++){
                    try {
                        System.out.println("divide " + arr[i] + " " + arr[i + 1] + " is " + arr[i] / arr[i + 1]);
                    }
                    catch(ArithmeticException e){
                        System.out.println("Arithmetic exception");
                    }
                }
        }
        catch(Exception e){
            System.out.println("exception");
        }
//        catch (IndexOutOfBoundsException e){
//            System.out.println("index out of bounds");
//        }
//        catch (NullPointerException e){
//            System.out.println("null pointer exception");
//        }
//        catch (NumberFormatException e){
//            System.out.println("number format exception");
//        }
    }
}
