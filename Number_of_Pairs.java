package Codeforces;

import java.util.Scanner;

public class Number_of_Pairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n,a,b;
            n=sc.nextInt();
            a=sc.nextInt();
            b=sc.nextInt();
            int[] arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int count=0;
            for (int i=0;i<n;i++){
                for (int j=i+1;j<n;j++){
                    if (arr[i]+arr[j]>=a&&arr[i]+arr[j]<=b){
                    count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
