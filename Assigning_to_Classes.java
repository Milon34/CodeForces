package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Assigning_to_Classes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] arr=new int[2*n];
            for (int i=0;i<2*n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int val=arr[n];
            System.out.println(val-arr[n-1]);
        }
    }
}
