package Codes;

import java.util.Scanner;
public class Percentage {
    public static void main(String[] args){
        float math,phy,bio,che,pps;
        float percentage,total;
        String Name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name please:");
        Name=sc.nextLine();
        System.out.println("Enter the marks here:");
        System.out.print("Enter the marks in maths:");
        math=sc.nextFloat();
        System.out.print("Enter the marks in physics:");
        phy=sc.nextFloat();
        System.out.print("Enter the marks in biology:");
        bio=sc.nextFloat();
        System.out.print("Enter the marks in chemistry:");
        che=sc.nextFloat();
        System.out.print("Enter the marks in c language:");
        pps=sc.nextFloat();
        total=math+phy+bio+che+pps;
        percentage=(total/500)*100;
        System.out.println("Congratulations "+Name+" you got "+percentage);
    }
}
