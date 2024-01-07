package Arrays;

public class MIninArray {
    public static void main(String[] args) {
        int[] array = {44,2,3,4,7};
        System.out.println(Minvalue(array));
    }
    static int Minvalue(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
                return min;
            }
        }
        return -1;
    }
}
