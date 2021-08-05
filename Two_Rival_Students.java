package Codeforces;

import java.util.Scanner;

public class Two_Rival_Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, a, b, c;
            n = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            int min = Math.min(b, c);
            int max = Math.max(b, c);
           if ((max-min+a)>=n){
               System.out.println(n-1);
           }else {
               System.out.println(max-min+a);
           }
        }
    }
}
