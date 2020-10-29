package Contest_Practice.GraknForce2020;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n +1], b[] = new int[n +1], c[] = new int[n+1];
            for (int i = 0; i < n; i++) {
                a[i+1] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i+1] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                c[i+1] = sc.nextInt();
            }

            int ans[] = new int[n + 1];
            ans[0] = a[0];
            for (int i = 1; i < n; ++i) {
                if (a[i] != ans[i - 1]) {
                    ans[i] = a[i];
                } else if (b[i] != ans[i - 1]) {
                    ans[i] = b[i];
                } else {
                    ans[i] = c[i];
                }

                if (a[n] != ans[n - 1] && a[n] != ans[1]) {
                    ans[n] = a[n];
                }
                else if (b[n] != ans[n - 1] && b[n] != ans[1]) {
                    ans[n] = b[n];
                }
                else {
                    ans[n] = c[n];
                }
            }
            for (int i=0;i<n;i++){
                System.out.print(ans[i+1]+" ");
            }
            System.out.println();
        }
    }
}
