package Codeforces;

import java.util.Scanner;

public class Integer_Sequence_Dividing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1=new int[]{1,1,0,0,1,1,0,0,1,1};
        int[] arr2=new int[]{0,0,1,1,0,0,1,1,0,0};
        int val=n%4;
//        String s= String.valueOf(n);
//        if (((s.charAt(0)-'0')-1)%2!=0){
//            System.out.println(arr2[n%10]);
//        }else {
//            System.out.println(arr1[n%10]);
//        }
        if (val==0||val==3){
            System.out.println(0);
        }else {
            System.out.println(1);
        }
    }
}
