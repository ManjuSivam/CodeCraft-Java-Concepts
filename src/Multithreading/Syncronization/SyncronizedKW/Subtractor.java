package Multithreading.Syncronization.SyncronizedKW;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    Count cnt;
    public Subtractor(Count cnt){

        this.cnt=cnt;

    }
    @Override
    public void run(){

        for(int i=1; i<=100000; i++){
            synchronized (cnt) {
                cnt.val -= i;
            }
        }
    }
}
