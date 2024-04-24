
import java.util.Scanner;

public class string_cut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char alphabet = sc.next().charAt(0);
        boolean found = false;
        boolean print = false;
        int prev = 0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i) == alphabet){
                found = true;
                if(prev != i){
                    System.out.println(text.substring(prev, i));
                    print = true;
                }
                prev = i+1;
            } else if(i == text.length()-1 && prev != 0){
                System.out.println(text.substring(prev, text.length()));
                print = true;
            }
        }

        if(!found){
            System.out.println("no target character found");
        } else if(!print){
            System.out.println("no output");
        }
    }
}
