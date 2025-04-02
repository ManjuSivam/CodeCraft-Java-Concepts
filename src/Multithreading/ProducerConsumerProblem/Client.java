package Multithreading.ProducerConsumerProblem;

public class Client {
    public static void main(String[] args) {
        Queue q = new Queue();
        int storeSize = 6;

        Producer p = new Producer(q);
        Consumer c = new Consumer(q);


        Thread t1=new Thread(p);
        Thread t2=new Thread(c);

        t1.start();
        t2.start();


    }
}
