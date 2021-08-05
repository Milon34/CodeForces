package Codeforces;

import java.util.Scanner;

public class Petr_and_Book {
    static int lower(int a[], int x) { // x is the target value or key
        int l = -1, r = a.length;
        while (l + 1 < r) {
            int m = (l + r) >>> 1;
            if (a[m] >= x) r = m;
            else l = m;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[7];
        int sum = 0;
        for (int i = 0; i < 7; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        int p = 0;
        while (n!=0) {
            p = p % 7;
            n-=arr[p];
            n=Math.max(n,0);
            p++;
        }
        System.out.println(p);
    }
}
