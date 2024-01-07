package Strings;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        String Name;
        System.out.print("Enter a string:");
        Name=sc.nextLine();
        String rev="";
        int length=Name.length();
        for(int i=length-1;i>=0;i--){
            rev= rev + Name.charAt(i);
        }
        if(Name.equals(rev)){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}