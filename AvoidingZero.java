package Contest_Practice;

import java.util.Arrays;
import java.util.Scanner;

 public class AvoidingZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int mSum=0,pSum=0;
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if (arr[i]>0){
                    mSum=mSum+arr[i];
                }else {
                    pSum=pSum+arr[i];
                }
            }

            if (mSum+pSum ==0){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
                Arrays.sort(arr);
                if (mSum>Math.abs(pSum)){
                    for (int i=n-1;i>-1;i--){
                        System.out.print(arr[i]+" ");
                    }
                    System.out.println();
                }else {
                    for ( int i=0;i<n;i++){
                        System.out.print(arr[i]+ " ");
                    }
                    System.out.println();
                }
            }

        }
    }
}
