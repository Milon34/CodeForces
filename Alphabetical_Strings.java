package Codeforces;

import java.util.Scanner;
public class Alphabetical_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        m:while (t-- > 0) {
            char[] s = sc.next().toCharArray();
            int l = 0, r = s.length - 1;
            for (int i = s.length - 1; i >= 0; i--) {
                char c = (char) ('a' + i);
                if (s[l] == c) {
                    l++;
                } else if (s[r] == c) {
                    r--;
                } else {
                    System.out.println("NO");
                    continue m;
                }
            }
            System.out.println("YES");
        }
    }
}

