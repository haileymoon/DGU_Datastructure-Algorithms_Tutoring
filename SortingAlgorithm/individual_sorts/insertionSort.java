package SortingAlgorithm.individual_sorts;

public class insertionSort {
    private static void insertion_sort(int[] array) {
        for(int i = 1; i < array.length; i++){
            for(int j = i-1; j>=0; j--){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                } else break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        insertion_sort(array);
        for(int i : array){
            System.out.println(i);
        }
    }
}
