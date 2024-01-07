package Codes;

public class Coed {
    public static void main(String[] args){
        Loops(1,10);
    }
    public static void Loops(int initial,int finaal){
        if(initial <= finaal){
            System.out.print(initial+" ");
            Loops(initial+1,finaal);
        }
    }
}