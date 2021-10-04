public class sortMain {
    public static void main(String[] args) {
        sortingAlgorithms sort = new sortingAlgorithms();

        int[] array = {9,8,7,5,6,4,0};
        
        //sort.bubble_sort(array);
        //sort.selection_sort(array);
        //sort.insertion_sort(array);
        sort.quick_sort(array, 0, array.length - 1);
        print_array(array);
    }

    public static void print_array(int[] array){
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
}
