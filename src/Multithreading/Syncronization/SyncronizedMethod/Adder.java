package Multithreading.Syncronization.SyncronizedMethod;

public class Adder implements Runnable{

    Count cnt;
    public Adder(Count cnt){

        this.cnt=cnt;

    }
    @Override
    public void run(){

        for(int i=1; i<=100000; i++){
            cnt.addValue(i);
           }

    }
}
