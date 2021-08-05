package Codeforces;

import java.util.Scanner;

public class TitforTat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, k;
            n = sc.nextInt();
            k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
              while (arr[i]>0&&k-->0){
                  arr[i]--;
                  arr[n-1]++;
              }
            }
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
