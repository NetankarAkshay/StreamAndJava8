package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* Given a list of strings, write a method to return a new list containing only the strings with length greater than 5.*/
public class StringsGreaterThan5 {
    public static void main(String args[]){
        List<String>strings = Arrays.asList("apple", "banana", "orange", "kiwi", "grape");
        List<String>result = getStringGreaterThan5(strings);
        System.out.println(result);
    }
    public static List<String>getStringGreaterThan5(List<String>strings){
        return strings.stream()
                .filter(s->s.length()>5)
                .collect(Collectors.toList());
    }

}
