package Codeforces;

import java.util.Scanner;

public class Supercentral_Point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr1[i] = a;
            arr2[i] = b;
        }

        int count = 0;
        m:
        for (int i = 0; i < n; i++) {
            int x = arr1[i];
            int y = arr2[i];
            boolean f1 = false, f2 = false, f3 = false, f4 = false;
            for (int j = 0; j < n; j++) {
                if (x == arr1[j] && y < arr2[j]) {
                    f1 = true;
                }
                if (x == arr1[j] && y > arr2[j]) {
                    f2 = true;
                }
                if (y == arr2[j] && x < arr1[j]) {
                    f3 = true;
                }
                if (y == arr2[j] && x > arr1[j]) {
                    f4 = true;
                }
            }
            if (f1 && f2 && f3 && f4) {
                count++;
            }
        }
        System.out.println(count);
    }
}
