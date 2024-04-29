package Multithreading.Syncronization.SyncronizedKW;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count cnt = new Count();

        Adder adder = new Adder(cnt);
        Subtractor subtractor = new Subtractor(cnt);

        Thread thread1 = new Thread(adder);
        Thread thread2 = new Thread(subtractor);

        thread1.start();
        thread2.start();

        //TODO -> Read about join.
        thread1.join();
        thread2.join();

        //when we reach this line, threads might not have completed.
//        so using join
        System.out.println(cnt.val);
    }
}
