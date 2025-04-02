package Multithreading.ProducerConsumerProblem;

public class Consumer implements Runnable {

    Queue q;

    Consumer(Queue q){
        this.q = q;
    }
    @Override
    public void run() {

      while (true){
            q.getData();

      }
    }
}
