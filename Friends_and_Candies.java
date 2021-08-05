package Codeforces;

import java.util.Scanner;

public class Friends_and_Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int sum=0;
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            if (sum%n!=0){
                System.out.println(-1);
                continue;
            }
            int val=sum/n;
            int count=0;
            for (int i=0;i<n;i++){
                if (arr[i]>val){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
