package Multithreading.print1to100;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientExecutorSrvc {
    public static void main(String[] args) {
      ExecutorService exeSrvc = Executors.newFixedThreadPool(10);
      for(int i=0;i<=100;i++){
          NumberPrinter np = new NumberPrinter(i);
          exeSrvc.submit(np);

      }
      exeSrvc.shutdown();
    }
}
