package Multithreading.Runnable.HelloWorldDiffThread;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World from "+ Thread.currentThread().getName());
        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread thread = new Thread(hwp);
        thread.start();
        System.out.println("Hello World from "+ Thread.currentThread().getName());



    }
}
