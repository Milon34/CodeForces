package Codeforces;

import java.util.Scanner;

public class Balanced_Remainders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int[] myArr=new int[3];
            for(int i=0;i<n;i++){
                myArr[arr[i]%3]++;
            }
            int count=n/3,res=0;
            while (Math.max(myArr[0],Math.max(myArr[1],myArr[2]))*3>n) {
                for (int i = 0; i < myArr.length; i++) {
                    if (myArr[i] > count) {
                        int val = myArr[i] - count;
                        myArr[(i + 1) % 3] += val;
                        myArr[i] -= val;
                        res += val;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
