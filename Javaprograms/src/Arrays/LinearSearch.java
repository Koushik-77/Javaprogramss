package Arrays;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Enter the target");
        int target = in.nextInt();
        int ans = LinearSearch1(array,target);
        System.out.println(ans);
    }
    static int LinearSearch1(int[] arr,int target){
        if(arr.length ==  0){
            return -1;
        }
        for(int num : arr){
            if(num == target){
                return target;
            }
        }
        return -1;
    }
}
