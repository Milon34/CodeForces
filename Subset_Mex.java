package Codeforces;

import java.util.Scanner;

public class Subset_Mex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] arr=new int[101];
            for (int i=0;i<n;i++){
                arr[sc.nextInt()]++;
            }
            int sum=0;
            for (int i=0;i<arr.length;i++){
                if (arr[i]==0){
                    sum+=i;
                    break;
                }else {
                    arr[i]-=1;
                }
            }
            for (int i=0;i<arr.length;i++){
                if (arr[i]==0){
                    sum+=i;
                    break;
                }
            }
            System.out.println(sum);
        }
    }
}
