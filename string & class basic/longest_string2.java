
import java.util.Scanner;

public class longest_string2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] text = new String[5];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 5; i++){
            text[i] = sc.nextLine();
           if(text[i].length() > max){
               max = text[i].length();
           }
        }
        for(int i = 4; i >= 0; i--){
            if(max == text[i].length()){
                System.out.println(text[i]);
                break;
            }
        }
    }
}
