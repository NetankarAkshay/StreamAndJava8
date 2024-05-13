package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* Problem: Given a list of integers, write a method to return a new list containing only the distinct elements.
*
* */
public class DistinctNumbers {
    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6);
        List<Integer> distinctNumbers = getDistinctNumbers(numbers);
        System.out.println(distinctNumbers);
    }

    public static List<Integer>getDistinctNumbers(List<Integer> numbers){
        return  numbers.stream()
                .distinct()
                .collect(Collectors.toList());

    }
}
