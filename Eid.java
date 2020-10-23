package Contest_Practice;

import java.util.Scanner;

 class Eid {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        int t=sc.nextInt();
        int a []=new int[100];
        int i,j=0;
        while (t-->0){
            int n=sc.nextInt();
            int max=a[0];
            for ( i=0;i<n;i++){
                 a[i]=sc.nextInt();
                if (a[i]>max){
                    max=a[i];
                }
            }
                j++;
                System.out.println("Case "+j+": "+max);
            }



        }

    }

