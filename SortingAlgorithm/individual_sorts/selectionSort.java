package SortingAlgorithm.individual_sorts;

class selectionSort { 
   // min 찾아서 앞으로 보내주면서 정렬
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
   private static void selection_sort(int[] array) {
      int min;
      for(int i = 0; i< array.length;i++){
         min = i;
         for(int j = i+1; j < array.length; j ++){
            if(array[j] < array[min]) min = j;
         }
         if(min != i) swap(array, i, min);
      }   
   }
   public static void main(String[] args) {
      int[] array = {9,8,7,6,4,3,2};
      selection_sort(array);
      printArray(array);
   }
}