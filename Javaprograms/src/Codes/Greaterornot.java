package Codes;

import java.util.Scanner;
public class Greaterornot {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a,b;
        a=10;
        System.out.print("Enter any number:");
        b=sc.nextInt();
        if (b>a){
            System.out.println("You have entered is greater ");
        }
        else {
            System.out.println("You have entered is not greater");
        }
    }
}
