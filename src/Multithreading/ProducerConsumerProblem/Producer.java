package Multithreading.ProducerConsumerProblem;


public class Producer implements Runnable {
    Queue q;

    Producer(Queue q){
        this.q = q;
    }
    @Override
    public void run(){
        int i=1;
        while (true){
            q.putData(i++);

        }
    }
}
