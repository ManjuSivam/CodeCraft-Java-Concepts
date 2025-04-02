package Streams.MapFilterReduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        List<Integer> multiple = nums.stream()
                .map(num -> num*2)
                .collect(Collectors.toList());
        System.out.println(multiple);

        List<Integer> even = nums.stream()
                .filter(num -> num%2 ==0)
                .collect(Collectors.toList());
        System.out.println(even);

        int sum = nums.stream()
                .reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
