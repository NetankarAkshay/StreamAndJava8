package StreamApi;

import java.util.Arrays;
import java.util.List;

/**
 *Problem: Given a list of integers, write a method to return the sum of all the even numbers in the list
 */
public class SumOfAllEvenNumbers {
    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum = sumOfEvenNumbers(numbers);
        System.out.println(sum);

    }
    public static int sumOfEvenNumbers(List<Integer> numbers){
        return  numbers.stream().filter(n->n%2==0)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
