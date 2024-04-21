
import java.util.Scanner;

public class string_cut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char alphabet = sc.next().charAt(0);
        int start = 0;
        boolean out = false;
        boolean target = false;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i) == alphabet){
                target = true;
                if(start != i){
                    System.out.println(text.substring(start,i));
                    out = true;
                }
                start = i+1;
            }else if(i == text.length() - 1 && start != 0){
                System.out.println(text.substring(start,text.length()));
                out = true;
            }
        }
        if(target == false){
            System.out.println("no target character found");
        }else if(out == false){
            System.out.println("no output");
        }
    }
}
