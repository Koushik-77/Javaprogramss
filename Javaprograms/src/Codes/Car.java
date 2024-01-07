package Codes;

import java.util.Scanner;

public class Car {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name;
        int age;
        int drive ;
        System.out.println("Enter your name:");
        name = in.next();
        System.out.println("Enter your age:");
        age = in.nextInt();
        if(age < 18) {
            System.out.println("You are not allowed");
        }
        else {
            System.out.println("Enter your driving licence:");
            drive = in.nextInt();
            System.out.println("Daily rental details");
            System.out.println("For day 1 the rent would be 1000");
            System.out.println("For day 2 the rent would be 2000");
            System.out.println("For day 3 the rent would be 3000");
            System.out.println("Enter how many days");
            int days = in.nextInt();
            if (days == 1) {
                System.out.println("The rent is 1000");
                System.out.println("Pay 1000 Online");
                System.out.println("Your name is :" + name);
                System.out.println("Your age is :" + age);
                System.out.println("Your driving licence is :" + drive);
                System.out.println("Successfully Done!");
            } else if (days == 2) {
                System.out.println("The rent is 2000");
                System.out.println("Pay 1000 Online");
                System.out.println("Your name is :" + name);
                System.out.println("Your age is :" + age);
                System.out.println("Your driving licence is :" + drive);
                System.out.println("Successfully Done!");
            } else if (days == 3) {
                System.out.println("The rent is 3000");
                System.out.println("Pay 1000 Online");
                System.out.println("Your name is :" + name);
                System.out.println("Your age is :" + age);
                System.out.println("Your driving licence is :" + drive);
                System.out.println("Successfully Done!");
            } else {
                System.out.println("The rent would not given for more than 3 days");
            }
        }
    }
}
