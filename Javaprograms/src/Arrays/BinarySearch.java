package Arrays;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr ={1,3,4,5,6,7};
        int target = 10;
        int start ,end,mid;
        start = arr[0];
        end =arr.length-1;
        while(start<=end) {
            mid = (start+end)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                System.out.println(mid);
                return;
            }
        }
        System.out.println("not found");
    }
}
