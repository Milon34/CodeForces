package Codeforces;

import java.util.Scanner;

public class Permutation_Sort {
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
           if (isSorted(arr)){
               System.out.println(0);
               continue;
           }
           if (arr[0]==1||arr[n-1]==n){
               System.out.println(1);
           }else if (arr[0]!=n||arr[n-1]!=1){
               System.out.println(2);
           }else {
               System.out.println(3);
           }
        }
    }
}
