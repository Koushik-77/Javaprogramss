package Codes;

public class Findnum {
    public static void main(String[] args){
        int[] a;
        int count = 0;
        a = new int[]{1, 3, 8, 5, 7, 5, 7, 8, 7, 9};
        for(int i=0;i<a.length;i++){
            if(a[i] == 7){
                count++;
            }
        }
        System.out.println(count);
    }
}
