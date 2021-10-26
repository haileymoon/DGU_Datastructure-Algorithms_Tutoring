package SearchingAlgorithm;

public class BinarySearch {
    static int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,20,30,50,100};
    public static void main(String[] args) {
        System.out.println(recursiveBinarySearch(0, arr.length-1, 50));
        System.out.println(normalBinarySearch(0, arr.length-1, 100));

    }
    //used SORTED list or array
    public static int recursiveBinarySearch(int low, int high, int value){
        int mid;
        while (low <= high){
            mid = (low +high) /2;
            
            if(value == arr[mid]){
                return mid;
            }
            else if (value < arr[mid]){
                //from arr[0] to arr[mid-1]
                return recursiveBinarySearch(low, mid-1, value);
            }
            else{
                //from arr[mid+1] to arr[high]
                return recursiveBinarySearch(mid+1, high, value);
            }
        }
        return -1;
    } 
    public static int normalBinarySearch(int low, int high, int value){
        int mid;

        while(low<=high){
            mid = (low + high) / 2;
            
            if(value == arr[mid]){
                return mid;
            }
            else if(value < arr[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
