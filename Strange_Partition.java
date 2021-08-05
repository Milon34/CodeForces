package Codeforces;

import java.util.Scanner;

public class Strange_Partition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n,k;
            n=sc.nextLong();
            k=sc.nextLong();
           // List<Integer> l=new ArrayList<>();
            long per=0;
            long sum=0;
            for (int i=0;i<n;i++){
                long a=sc.nextLong();
                sum+=a;
                per+=(long) Math.ceil((double) a/k);
            }
            System.out.println((long) Math.ceil ((double) sum/k)+" "+per);
        }
    }
}
