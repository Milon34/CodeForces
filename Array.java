package Codeforces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] arr=new Integer[n];
        int plus=0,minus=0;
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if (arr[i]<0&&arr[i]!=0){
                minus++;
            }else if (arr[i]!=0){
                plus++;
            }
        }
        Arrays.sort(arr);
        System.out.print(1+" ");
        int al=0;
        if (minus%2!=0) {
            for (int i = 0; i < minus-1; i++) {
                System.out.print(arr[i] + " ");
                al=i;
            }
        }
        System.out.println();
        System.out.print(1+" ");
        for (int i=0;i<plus;i++){
            System.out.print(arr[i]+" ");
        }
        for (int i=al;i<minus;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print(1+" "+0);
    }
}
