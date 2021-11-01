package SearchingAlgorithm;

public class BinarySearch {
//used on SORTED array or list
//1 2 3 4 5 6 7 8 9 
    static int[] arr = {1,2,5,6,7,10,20,30,50};
    public static void main(String[] args) {
        System.out.println(recursiveBinarySearch(0, arr.length-1, 20));
        System.out.println(normalBinarySearch(0, arr.length-1, 30));
    }
    public static int recursiveBinarySearch(int start, int end, int value){
        int mid;
        if(start<=end){
            mid = (start + end) / 2;
            if(value == arr[mid]){
                return mid;
            }
            else if(value < arr[mid]){
                return recursiveBinarySearch(start, mid-1, value);
            }
            else{
                return recursiveBinarySearch(mid+1, end, value);
            }
        }
        return -1;
    }

    public static int normalBinarySearch(int start, int end, int value){
        int mid;
        while(start<=end){
            mid = (start + end) / 2;
            
            if(value == arr[mid]){
                return mid;
            }
            else if(value < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
