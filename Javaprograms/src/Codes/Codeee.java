package Codes;

import java.io.*;
import java.util.*;

class Codeee {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            boolean unique = true;
            for(int j=0;j<n;j++){
                if(i != j && array[i] == array[j]){
                    unique = false;
                    break;
                }
            }
            if(unique){
                System.out.print(array[i]+" ");
            }
        }
    }
}