
import java.util.Scanner;

public class vote {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            num[a - 1]++;
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (num[i] == max) {
                System.out.println(i+1);
            }
        }
        System.out.println(max);
    }
}
