package Codeforces;

import java.util.Scanner;

public class New_Year_and_Naming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        String[] arr1 = new String[n];
        String[] arr2 = new String[m];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.next();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.next();
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            a = a - 1;
            String s = arr1[(a % n)] + arr2[(a % m)];
            System.out.println(s);
        }
    }
}
