package Contest_Practice.Div3_677;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tt=sc.nextInt();
        while (tt-- >0){
            int n=sc.nextInt();
            int first=-1;
            int last = 0;
            int arr[]= new int[n + 1];
            for (int i=1;i<=n;i++){
                int a;
                a= sc.nextInt();
                if (a==1){
                    if (first == -1){
                        first=i;
                    }
                    last=i;
                }
                arr[i]=a;
            }
            int count=0;
            for (int i=first;i<=last;i++){
                if (arr[i]!=1){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
