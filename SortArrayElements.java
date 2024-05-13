package Array;

import java.util.Arrays;

public class SortArrayElements {
    public static void main(String args[]){
        String[] names = {"Alice","Bob","Chaelie","David","Eve"};
        String[] sortedNames = Arrays.stream(names)
                .sorted((a,b)->Integer.compare(a.length(),b.length()))
                .toArray(String[]::new);

        System.out.println("Sorted names by length: "+Arrays.toString(sortedNames));





    }
}
