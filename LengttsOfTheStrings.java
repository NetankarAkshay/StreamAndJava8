package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem: Given a list of strings, write a method to return a new list containing the lengths of the strings.
 */


public class LengttsOfTheStrings {
    public static void main(String args[]){
        List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi", "grape");
        List<Integer> lengths = getStringLengths(strings);
        System.out.println(lengths);
    }
    public static List<Integer>getStringLengths(List<String> strings){
        return strings.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }

}
