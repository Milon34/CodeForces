package Codeforces;

import java.util.Scanner;

public class Equalize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] ch1 = sc.next().toCharArray();
        char[] ch2 = sc.next().toCharArray();
        int res = 0;
        for (int i = 0; i < n;) {
            if (ch1[i] != ch2[i]) {
                if (i + 1 < n && ch1[i + 1] != ch2[i + 1] && ch1[i] != ch1[i + 1]) {
                    res++;
                    i += 2;
                } else {
                    res++;
                    i++;
                }
            } else {
                i++;
            }
        }
        System.out.println(res);
    }
}
