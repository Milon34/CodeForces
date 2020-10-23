package Contest_Practice;

import java.util.Scanner;

public class BalanceArraySolution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            n=n/2;
            if (n%2!= 0) {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
                for (int i=1;i<=n;i++){
                    System.out.print(i*2+" ");
                }
               for ( int i=1;i<n;i++){
                   System.out.print(i*2-1+" ");
            }
            System.out.print(3*n-1+" ");
            System.out.println();
        }
    }
}
