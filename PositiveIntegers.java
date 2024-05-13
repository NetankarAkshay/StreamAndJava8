package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveIntegers
{
    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(-3, -2, -1, 0, 1, 2, 3);
        List<Integer> result = getPositiveValues(numbers);
        System.out.println(result);

    }
    public static List<Integer> getPositiveValues(List<Integer> numbers){
        return numbers.stream()
                .filter(n -> n>0)
                .collect(Collectors.toList());
    }
}
