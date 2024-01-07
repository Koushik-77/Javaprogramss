package Arrays;
import java.util.*;
import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<2;i++){
            list.add(scan.nextInt());
        }
        for(int i=0;i<2;i++){
            System.out.println(list.get(i));
        }
    }
}
