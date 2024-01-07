package Strings;

public class Replace {
    public static void main(String[] args) {
        String Name = "Koushik Teja";
        String New;
        New=Name.replace('o','u');
        System.out.println(New);
        System.out.println(Name.startsWith("K"));
        System.out.println(Name.endsWith("k"));
        System.out.println(Name.charAt(0));
        System.out.println(Name.indexOf("s"));
        String rep=Name.replace(' ','_');
        System.out.println(rep);
    }
}