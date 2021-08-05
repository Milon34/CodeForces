package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Vasya_and_Chocolate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n,a,b,c;
            n=sc.nextLong();
            a=sc.nextLong();
            b=sc.nextLong();
            c=sc.nextLong();
            long val=n/c;
            if (val<a){
                System.out.println(val);
            }else {
                long per=val/a;
                long per1=val%a;
                System.out.println((per*a)+(per*b)+per1);
            }
        }
    }
}
class testArray{
    public static void main(String[] args) {
        int[] arr=new int[4];
        arr[0]=5;
        arr[1]=4;
        arr[2]=3;
        arr[3]=2;
        Arrays.sort(arr,1,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}