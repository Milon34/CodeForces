package Contest_Practice.GoodBye_2020;

import java.util.Scanner;

public class Replay_B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int rev=Integer.MIN_VALUE;
            int ans=0;

            for (int i=0;i<n;i++){
                if (arr[i]<=rev){
                    arr[i]++;
                }if (arr[i]>rev){
                    rev=arr[i];
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
