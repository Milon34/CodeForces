package Contest_Practice.GoodBye_2020;

import java.util.HashSet;
import java.util.Scanner;

public class Replay_A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            HashSet<Integer> set=new HashSet<>();
            int ans=0;
            for (int i=0;i<n;i++){
                for (int j=i+1;j<n;j++){
                    set.add(arr[j]-arr[i]);
                }
            }
            System.out.println(set.size());
        }
    }
}
