package Multithreading.Callable.TreeSizeCalculator;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable {

   private Node root;
   private ExecutorService exeSrvc;
    public TreeSizeCalculator(Node root, ExecutorService exeSrvc){
        this.root = root;
        this.exeSrvc = exeSrvc;

    }
    @Override
    public Integer call() throws Exception{
        if(root==null)
            return 0;
        TreeSizeCalculator leftCalculator = new TreeSizeCalculator(root.getLeft(), exeSrvc);
        TreeSizeCalculator rightCalculator = new TreeSizeCalculator(root.getRight(), exeSrvc);

        Future<Integer> leftSizeFut = exeSrvc.submit(leftCalculator);
        Future<Integer> rightSizeFut = exeSrvc.submit(rightCalculator);

        try {
            int leftSize = leftSizeFut.get();
            int rightSize = rightSizeFut.get();
            return  leftSize+rightSize+1;
        }
        catch (Exception e){
            return 0;
        }

    }
}
