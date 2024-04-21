
import java.util.Scanner;

public class longest_string4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String longest = " ";
        for(;;){
            String text = sc.nextLine();
            if(text.length() == 0){
                break;
            }
            if(text.length() >= max){
                max = text.length();
                longest = text;
            }
        }
        System.out.println(longest);
    }
}
