package Codeforces;

import java.util.Scanner;

public class Divide_it {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       m: while (t-->0){
            long n=sc.nextLong();
            int count=0;

            while (n!=1){
                boolean check=false;
                if (n%5==0){
                    count+=3;
                    n/=5;
                    check=true;
                }
                if (n%3==0){
                    count+=2;
                    n/=3;
                    check=true;
                }
                if (n%2==0){
                    count+=1;
                    n/=2;
                    check=true;
                }
                if (!check){
                    System.out.println(-1);
                    continue m;
                }
            }
           System.out.println(count);
        }
    }
}
