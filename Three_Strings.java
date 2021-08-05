package Codeforces;


import java.util.Scanner;

public class Three_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s1, s2, s3;
            s1 = sc.next();
            s2 = sc.next();
            s3 = sc.next();
            boolean check = true;
            for (int i = 0; i < s1.length(); i++) {
                if (s3.charAt(i) == s1.charAt(i) || s3.charAt(i) == s2.charAt(i)) {
                    continue;
                } else {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
