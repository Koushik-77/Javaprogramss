package Arrays;
import java.util.*;
public class LeftRotateaArrayOnePlacce {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int[] arrr = isRotated(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arrr[i] + " ");
        }
    }
    static int[] isRotated(int[] arr){
        int temp = arr[0];
        for(int i = 1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        return arr;
    }
}
