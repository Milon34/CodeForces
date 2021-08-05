package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class The_Rank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int val=0;
        for (int i=0;i<n;i++){
            int a,b,c,d;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
            arr[i]=a+b+c+d;
            if (i==0){
                val=arr[i];
            }
        }
        Arrays.sort(arr);
        int rank=0;
        for (int i=0;i<n;i++){
            if (arr[i]==val){
                rank=i;
            }
        }
        System.out.println(n-rank);

    }
}
