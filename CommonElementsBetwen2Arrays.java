package CollectionFrameworj;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsBetwen2Arrays {
    public static void main(String args[]){
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {4,5,6,7,8};

        Set<Integer> set1 = new HashSet<>();
        for(int num: array1){
            set1.add(num);
        }
        Set<Integer>commonElements = new HashSet<>();
        for(int num: array2){
            if(set1.contains(num)){
                commonElements.add(num);
            }
        }

        System.out.println("Common elements: "+commonElements);


        
    }
}
