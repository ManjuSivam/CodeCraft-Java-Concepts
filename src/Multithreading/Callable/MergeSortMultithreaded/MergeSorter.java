package Multithreading.Callable.MergeSortMultithreaded;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable {
    List<Integer> listToSort;
    ExecutorService exeSrvc;
    public MergeSorter(ExecutorService exeSrvc, List<Integer> listOfNo){
        this.exeSrvc=exeSrvc;
        this.listToSort=listOfNo;
    }
    @Override
    public List<Integer> call() throws Exception {
        int n = listToSort.size();
        if(n==1)
            return listToSort;
        List<Integer> leftHalf= new ArrayList<>();
        List<Integer> rightHalf = new ArrayList<>();
        for (int i=0; i<n/2; i++){
            leftHalf.add(listToSort.get(i));
        }
        for(int i=n/2; i<n; i++){
            rightHalf.add((listToSort.get(i)));
        }

        //recursively splits the list in to two halves and creates new Mergsorter instances to sort them
        MergeSorter leftSorter = new MergeSorter(exeSrvc,leftHalf);
        MergeSorter rightSorter = new MergeSorter(exeSrvc,rightHalf);
//        List<Integer> sortedLeft = exeSrvc.submit(leftSorter); //expecting future
//        List<Integer> sortedRight = exeSrvc.submit(rightSorter); //expecting future

        //Future is used to get asynchronous results
        Future <List<Integer>> leftFuture = exeSrvc.submit(leftSorter);
        Future <List<Integer>> rightFuture = exeSrvc.submit(rightSorter);
        List<Integer> sortedLeft = leftFuture.get();
        List<Integer> sortedRight = rightFuture.get();

        //Merge Logic
        List<Integer> finalSortedList = new ArrayList<>();
        int i=0, j=0;
        while(i<sortedLeft.size() && j<sortedRight.size()){
            if(sortedLeft.get(i)<sortedRight.get(j)){
                finalSortedList.add(sortedLeft.get(i));
                i++;
            }
            else {
                finalSortedList.add((sortedRight.get(j)));
                j++;
            }
        }
        while ((i<sortedLeft.size())){
            finalSortedList.add(sortedLeft.get(i));
            i++;
        }
        while ((j<sortedRight.size())){
            finalSortedList.add(sortedRight.get(j));
            j++;
        }
        return finalSortedList;
    }
}
