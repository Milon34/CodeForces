package Codeforces;

import java.util.LinkedList;
import java.util.Scanner;

public class Mishka_and_Contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        LinkedList<Integer> l = new LinkedList<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
            l.add(a);
        }
        int count=0;
       for (int i=0;i<n;i++){
           if (arr[i]<=m){
               count++;
           }else {
               break;
           }
       }
       if (count==n){
           System.out.println(count);
           return;
       }
       for (int i=n-1;i>=0;i--){
           if (arr[i]<=m){
               count++;
           }else {
               break;
           }
       }
        System.out.println(count);
    }
}
