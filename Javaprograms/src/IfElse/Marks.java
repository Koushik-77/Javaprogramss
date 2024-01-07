package IfElse;
import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int phy,chem,maths;
        System.out.println("Enter your marks in physics subject");
        phy=sc.nextInt();
        System.out.println("Enter your marks in chemistry subject");
        chem=sc.nextInt();
        System.out.println("Enter your marks in maths subject");
        maths=sc.nextInt();
        float avg=(phy+chem+maths)/(3.0f);
        System.out.println("Your percentage is "+avg);
        if(avg>=40 && phy>=33 && chem>=33 && maths>=33){
            System.out.println("You are promoted");
        }
        else{
            System.out.println("Sorry! You are not promoted");

        }
    }
}
