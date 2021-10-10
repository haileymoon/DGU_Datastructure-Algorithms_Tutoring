package SortingAlgorithm.individual_sorts;

public class quickSort { //분할해서 피봇 기준으로 정렬 (재귀)
    private static void swap(int[] array, int b, int c) {
        int temp = array[b];
        array[b] = array[c];
        array[c] = temp;
     }
  
     private static void printArray(int[] a) {
        for(int i : a){
           System.out.println(i);
        }      
     }

     private static void quickSort(int[] array, int start, int end) {
        if(start < end){
            int pivot = partition(array, start, end);

            quickSort(array, start, pivot - 1);
            quickSort(array, pivot, end);
        }
     }

     private static int partition(int[] array, int start, int end) {
        int tpivot = array[(start+end) / 2];
        
        while(start<=end){
            while(array[start] < tpivot){
                start ++;
            }
            while(array[end] > tpivot){
                end --;
            }
            if(start<=end){
                swap(array, start, end);
                start ++;
                end --;
            }
        }
        return start;
     }
     public static void main(String[] args) {
         int[] a = {5,4,3,3,2};
         quickSort(a, 0, a.length-1);
         printArray(a);
     }
}
