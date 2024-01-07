package Arrays;

import java.io.*;
import java.util.*;

public class Interchange_Diagonals {

    public static void main(String[] args) {
        /* Enter Print output to STDOUT. Your class should be named Main. */
        Scanner in = new Scanner(System.in);
        int a,b;
        a=in.nextInt();
        b=a;
        int[][] sum = new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                sum[i][j] = in.nextInt();
            }
        }
        for(int i=0;i<a;i++){
            int temp = sum[i][i];
            sum[i][i] = sum[i][a-i-1];
            sum[i][a-i-1] =  temp;
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

    }
}