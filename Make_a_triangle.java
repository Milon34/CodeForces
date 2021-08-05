package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Make_a_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[3];
        for (int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int val=arr[0]+arr[1];
        if (val>arr[2]){
            System.out.println(0);
        }else {
            System.out.println(arr[2]-val+1);
        }
    }
}
