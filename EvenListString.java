package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* Given a list of strings, write a method that returns a new list containing only the strings
* that have an even length.
*
* */
public class EvenListString {
    public static void main(String args[]){
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "kiwi", "grape");
        List<String> result = filterEvenLengthStrings(fruits);
        System.out.println(result);
    }
    public static List<String> filterEvenLengthStrings(List<String> strings){
        return strings.stream()
                .filter(s->s.length()%2 == 0)
                .collect(Collectors.toList());
    }
}
