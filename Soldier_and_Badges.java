package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Soldier_and_Badges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int res = 0;
        for (int i = 1; i <n; i++) {
            int d = Math.max(arr[i - 1] + 1, arr[i]);
            res += (d - arr[i]);
            arr[i] = d;
        }
        System.out.println(res);
    }
}
