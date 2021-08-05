package Codeforces;

import java.util.Scanner;

public class Ahahahahahahahaha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            boolean check=false;
            int countZ=0,countO=0;
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                if (a==0){
                    countZ++;
                }else {
                    countO++;
                }
            }
            if (countO<=countZ){
                System.out.println(countZ);
                for (int i=0;i<countZ;i++){
                    System.out.print(0+" ");
                }
                System.out.println();
            }else {
                if (countO%2!=0){
                    countO--;
                }
                System.out.println(countO);
                for (int i=0;i<countO;i++){
                    System.out.print(1+" ");
                }
                System.out.println();
            }
        }
    }
}
