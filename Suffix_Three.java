package Codeforces;

import java.util.Scanner;

public class Suffix_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            String sub="";
            try {
                 sub = s.substring(s.length() - 5, s.length());
            }catch (Exception e){
                sub=s;
            }
           // System.out.println(sub);
            if (sub.contains("desu") || sub.contains("masu")) {
                System.out.println("JAPANESE");
            } else if (sub.contains("mnida")) {
                System.out.println("KOREAN");
            } else if (sub.contains("po")) {
                System.out.println("FILIPINO");
            }
        }
    }
}
