
import java.util.Scanner;

public class index_of_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.next();
        int index = -2;
        boolean x = false;
        for(int i = 0; i < text1.length(); i++){
             int in = text1.indexOf(text2,i);
             if(in != index && in != -1){
                 System.out.print((in+1) +" ");
                 index = in;
                 x = true;
             }
        }
        if(!x){
            System.out.println("string not found");
          }
    }
}
