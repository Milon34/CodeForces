package Codeforces;

import java.util.Scanner;
public class Three_Indices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        m:while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    if (arr[i] < arr[j] && arr[j] > arr[j + 1]) {
                        System.out.println("YES");
                        System.out.println(i+1 + " " + (j+1) + " " + (j + 2));
                        continue m;
                    }
                }
            }
            System.out.println("NO");
        }
    }
}
