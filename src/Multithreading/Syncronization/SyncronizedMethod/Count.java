package Multithreading.Syncronization.SyncronizedMethod;

public class Count {
     private int val = 0;

     public synchronized void addValue(int i) {
          val += i;
     }

     public int getValue() {
          return val;
     }
}
