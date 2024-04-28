package Multithreading.Runnable.PrintNos;

public class NumberPrinter implements Runnable{
    int number;
    NumberPrinter(int num){
        this.number = num;
    }
    @Override
    public void run(){
        System.out.println(this.number+ " from thread.." + Thread.currentThread().getName());
    }
}
