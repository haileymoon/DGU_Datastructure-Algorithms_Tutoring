package SortingAlgorithm;

public class sortingAlgorithms {
    
    //Bubble sort - 옆에랑 비교, 개수만큼 반복
    public void bubble_sort(int[] array) {
        for(int i = 0; i < array.length; i++){ //회차
            for(int j = 1; j < array.length; j++){
                if(array[j-1] > array[j]){
                    swap(array, j-1, j);
                }
            }
        }  
    }

    //Insertion sort
    public void insertion_sort(int[] array) {
        for(int i = 1; i< array.length; i++){
            for(int j = i-1; j >= 0; j--){
                if(array[j] > array[j+1]){
                    swap(array, j, j+1);
                }else break;
            }
        }
    }  

    //Selection Sort - min 찾아서 앞으로 보내주면서 정렬
    public void selection_sort(int[] array) { 
        int min;
        for(int i = 0; i < array.length -1; i++){
            min = i;
            for (int j = i+1; j < array.length; j++){
                if(array[j] < array[min]) min = j;
            }
            if(min != i) swap(array, i, min);
        }        
    }

    //Quick Sort - 분할해서 피봇 기준으로 정렬 (재귀)
    public void quick_sort(int[] array, int start, int end) {

        if(start < end){
            int pivot = partition(array, start, end);

            quick_sort(array, start, pivot-1);
            quick_sort(array, pivot, end);
        }
    }

    //partition method used in Quick Sort method
    private static int partition(int[] array, int start, int end) {
        int tpivot = array[(start+end)/2];
        while(start <= end){// 만나기전까지
            while(array[start] < tpivot){
                start++;
            }
            while(array[end] > tpivot){
                end--;
            }
            if(start <= end){
                swap(array, start, end);
                start++;
                end--;               
            }
        }
        return start;
    }

    //swap method for all sorting functions
    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;        
    }
}
