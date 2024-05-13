package Array;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingArrayElements {
    public static void main(String args[]){
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        Map<Integer, String> groupedNames = Arrays.stream(names)
                .collect(Collectors.groupingBy(String::length,Collectors.joining(", ")));
        System.out.println("Grouped names by length: "+groupedNames);
    }
}
