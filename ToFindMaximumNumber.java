package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
* Given a list of integers, write a method to return
* the maximum number in the list
* */
public class ToFindMaximumNumber {
    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(3, 6, 8, 2, 9, 1);
        int maxNumber = findMaxNumber(numbers);
        System.out.println(maxNumber);
    }
    public static int findMaxNumber(List<Integer> numbers){
        Optional<Integer>max = numbers.stream()
                .max(Integer::compareTo);
        return max.orElseThrow(IllegalArgumentException::new);
    }

}
