package Exception;

public class NestedTryCatch {
    public static void main(String[] args) {
        System.out.println("hello");
        try {
            System.out.println("outer try");
//            System.out.println(10/0);
            try {
                System.out.println("inner try");
//                System.out.println(10/0);
            }
            catch (ArithmeticException ae){
                System.out.println("Arithmetic exception caught");
            }
            catch (ArrayIndexOutOfBoundsException aioobe){
                System.out.println("Array Index OOB exception caught");
            }
            finally {
                System.out.println("Inner finally !");
            }
        }
        catch (Exception e){
            System.out.println("outer catch");
        }
        finally {
            System.out.println("outer finally");
        }
        System.out.println("final statement");
    }
}
