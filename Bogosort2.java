package Codeforces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bogosort2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Integer[] arr=new Integer[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr, Collections.reverseOrder());
            for (int i:arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
