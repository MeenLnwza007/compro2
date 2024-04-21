
import java.util.Scanner;

public class Account3 {
    int balance = 10000;
    int deposit(int money){
        int result = 0;
        if(money > 0){
            result = 0;
        }else if(money <=0){
            result = -1;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        Account3 m = new Account3();
        int n = m.deposit(money);
        if(n == 0){
            m.balance += money;
            System.out.println(m.balance);
        }else if(n == -1){
            System.out.println("Error");
        }
    }
}
