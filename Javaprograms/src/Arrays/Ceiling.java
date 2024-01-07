package Arrays;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {-1, -12, 34, 40, 5, 46};
        int start = 0, mid, end = arr.length - 1;
        int target = 30;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Array is sorted");
        System.out.println("The index of target is :");
        int ans = BinarySearch(target,start,end,arr);
        System.out.println(ans);
    }

    public static int BinarySearch(int target, int start, int end, int[] arr) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
//                System.out.println(mid);
                return mid;
            }
        }
        return start;
    }
}
