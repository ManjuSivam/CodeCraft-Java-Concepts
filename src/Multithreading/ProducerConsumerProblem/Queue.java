package Multithreading.ProducerConsumerProblem;

public class Queue {
    int x;
    boolean dataAvailable = false;

    synchronized public void putData(int x){
        try{
            if(dataAvailable){ //already available
                System.out.println("Waiting for data to be consumed");
                wait();
            }
            else{
                this.x = x;
                System.out.println("Data is produced x --> "+x);
                dataAvailable = true;
                notify();
            }
        }
        catch (Exception e){
            System.out.println("Exception...");
        }


    }

    synchronized public void getData(){
        try{
            if(!dataAvailable){ // not available
                System.out.println("Waiting for data to be produced");
                wait();
            }
            else{
                System.out.println("Data is consumed x --> "+this.x);
                dataAvailable = false;
                notify();
            }
        }
        catch (Exception e){
            System.out.println("Exception...");
        }

    }

}
