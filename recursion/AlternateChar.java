
import java.util.Scanner;

public class AlternateChar {
    String alterMerge(String s1, String s2, int order) {
        if(s1.length() == 0){
            return "";
        }
        
        if(order == 1){
            return s1.charAt(0) + alterMerge(s1.substring(1),s2.substring(1),2);
        }else{
            return s2.charAt(0) + alterMerge(s1.substring(1),s2.substring(1),1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        int order = scan.nextInt();
        AlternateChar ac = new AlternateChar();
        String ans = ac.alterMerge(s1, s2, order);
        System.out.println(ans);
    }
}
