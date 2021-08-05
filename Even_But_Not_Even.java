package Codeforces;

import java.util.Scanner;

public class Even_But_Not_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        m:
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int sum = 0;
            String per = "";
            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i) - '0';
                per+= s.charAt(i);
                int val=per.charAt(per.length()-1)-'0';
                if (sum%2==0&&val%2!=0){
                    System.out.println(per);
                    continue m;
                }
            }
            System.out.println(-1);
        }
    }
}
