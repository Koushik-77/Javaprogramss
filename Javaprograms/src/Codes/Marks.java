package Codes;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        float math, phy, bio, che, pps;
        float percentage, total;
        Scanner sc = new Scanner(System.in);
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
            if ((math <= 100) && (phy <= 100) && (bio <= 100) && (che <= 100) && (pps <= 100)) {
                total = math + phy + bio + che + pps;
                percentage = (total / 500) * 100;
                System.out.println("Congratulations  you got " + percentage);
            } else {
                System.out.println("Codes.Marks should be less than 100");
            }

    }
}