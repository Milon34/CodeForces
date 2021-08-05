package Codeforces;

import java.util.Scanner;

public class Prime_Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a, b;
            a = sc.nextLong();
            b = sc.nextLong();
            boolean check = false;
            long val = a - b;
            if (val==1){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
        }
    }
}
