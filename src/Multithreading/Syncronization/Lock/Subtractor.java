package Multithreading.Syncronization.Lock;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    Lock lock;
    Count cnt;
    public Subtractor(Lock lock, Count cnt){
        this.lock=lock;
        this.cnt=cnt;

    }
    @Override
    public void run(){

        for(int i=1; i<=100000; i++){
            lock.lock();
            cnt.val -=i;
            lock.unlock();
        }
    }
}
