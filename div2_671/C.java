package Contest_Practice.div2_671;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, x;
            n = sc.nextInt();
            x = sc.nextInt();
            int count = 0, sum = 0;
            for (int i = 0; i < n; i++) {
                int value;
                value = sc.nextInt();
                if (value == x) {
                    count++;
                }
                sum += value;
            }
            if (count == n) {
                System.out.println("0");
            } else if (count > 0) {
                System.out.println("1");
            } else if (sum == n * x) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        }
    }
}
