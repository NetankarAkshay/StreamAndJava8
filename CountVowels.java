package StreamsAndstrings;

public class CountVowels {
    public static void main(String args[]){
        String str= "Hello World";
        long count = str.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c)!= -1).distinct().count();
        System.out.println("Number of vowels: "+count);
    }
}
