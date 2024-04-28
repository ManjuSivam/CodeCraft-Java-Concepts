package Multithreading.Callable.MergeSortMultithreaded;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        List<Integer> unsortedList = List.of(4,2,7,8,0,6,5,1,9,3);
        ExecutorService exeSrvc = Executors.newCachedThreadPool();//when we dont know the number of threads required
        MergeSorter mergeSorter = new MergeSorter(exeSrvc,unsortedList);
        Future<List<Integer>> sortedListFut = exeSrvc.submit(mergeSorter);
        try{
            List<Integer> finalList = sortedListFut.get();
            System.out.println(finalList);
        }
        catch (Exception e){
            System.out.println("Some error occured ");
        }
    }
}
