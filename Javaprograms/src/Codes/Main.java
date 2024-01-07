package Codes;

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        int a,b;
        a=0;
        b=1;
        int c;
        int test;
        test = scan.nextInt();
        if(test<=0){
            System.out.println("0");
        }
        for(int i=0;i<test;i++){
            c = a;
            a = b;
            b = c+a;
            System.out.print(c+" ");
        }
    }
}