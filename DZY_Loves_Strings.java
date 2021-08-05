package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class DZY_Loves_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int k = 0;
        for (int i = 1; i <= s.length(); i++) {
            int val = s.charAt(i - 1) - 97;
            sum += i * arr[val];
            k++;
        }
        Arrays.sort(arr);
        k++;
      //  System.out.println(Arrays.toString(arr));

        for (int i = 25; i >= 26 - n; i--) {
            sum += k * arr[25];
            k++;
        }
        System.out.println(sum);
    }
}
