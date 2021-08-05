package Codeforces;

import java.util.Scanner;

public class Red_and_Blue_Beans {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long a,b,c;
            a=sc.nextLong();
            b=sc.nextLong();
            c=sc.nextInt();
            long min,max;
            min=Math.min(a,b);
            max=Math.max(a,b);
            if ((min*(c+1))>=max){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
