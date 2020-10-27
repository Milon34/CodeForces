package Contest_Practice;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n,x;
            n=sc.nextInt();
            x=sc.nextInt();
            if (n<=2){
                System.out.println(1);
            }else {
                System.out.println((n-3)/x+2);
            }
        }
    }

}

class A {
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            int count=0;
            for (int i=0;i<5;i++){
                count++;
            }
            System.out.println(count);
        }
        }
        }