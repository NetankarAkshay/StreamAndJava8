package Array;
/* Java program that finds the common elements between two arrays without using the Collection framework:*/
public class ToFindCommonElements {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        findCommonElements(array1, array2);
    }
    public static void findCommonElements(int[] array1, int[]array2){

        StringBuilder commonElements = new StringBuilder();

        for(int i = 0; i < array1.length; i++){
            for(int j= 0; j<array2.length; j++){
                if(array1[i] == array2[j]){
                    if(commonElements.length() >0){
                        commonElements.append(",");
                    }
                    commonElements.append(array1[i]);
                    break;// exit inner loop once a match is found
                }
            }
        }

        System.out.println("Common Elements: "+commonElements);

    }


}
