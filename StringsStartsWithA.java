package StreamApi;

/*
* Problem: Given a list of strings, write a method to return a new list containing only the strings that starts with
* the letter "a"(case sensitive).
* */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StringsStartsWithA {
    public static  void main(String args[]){
        List<String>strings = Arrays.asList("Apple", "banana", "avocado", "kiwi", "apricot");
        List<String>results = stringsStartsWithA(strings);
        System.out.println(results);
    }
   public static List<String> stringsStartsWithA(List<String> strings){
        return strings.stream().filter(s->s.toLowerCase().startsWith("a"))
                .collect(Collectors.toList());
   }
}
