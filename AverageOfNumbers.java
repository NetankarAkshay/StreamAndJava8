package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

//Problem: Given a list of integers, write a method to return the average of all the numbers.
public class AverageOfNumbers {
    public static void main(String args[]){
        List<Integer>numbers = Arrays.asList(1, 2, 3, 4, 5);
        double average = calculateAverage(numbers);
        System.out.println(average);
    }
    public static double calculateAverage(List<Integer> numbers){
        OptionalDouble average = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average();

        return average.orElse(0.0);
    }
}
