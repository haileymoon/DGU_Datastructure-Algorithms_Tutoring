package SortingAlgorithm.individual_sorts;

/**
 * SortingAlgorithms
 */
public class bubbleSort { //옆에랑 비교, 개수만큼 반복
    private static void bubble_sort(int[] array) {
        int temp;
        for(int i = 0; i <array.length; i++){
            for(int j = 1; j<array.length;j++){
                if(array[j-1]>array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }        
    }
    public static void main(String[] args) {
        int[] a ={7,6,4,4,3,2};
        bubble_sort(a);
        for(int i: a){
            System.out.print(i);
        }
        System.out.println();
    }
}