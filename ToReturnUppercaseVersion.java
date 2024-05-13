package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* Given a list of strings, write a method to return a new list containing the uppercase versions
* of all the strings
*
* */
public class ToReturnUppercaseVersion {
    public static void main(String args[]){
        List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi", "grape");
        List<String> result = toUpperCase(strings);
        System.out.println(result);

    }
    public static  List<String> toUpperCase(List<String> strings){
        return strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
