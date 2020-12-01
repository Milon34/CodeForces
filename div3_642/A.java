package Contest_Practice.div3_642;
import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n,m;
            n=sc.nextInt();
            m=sc.nextInt();
            if (n==1){
                System.out.println("0");
            }else if(n<m) {
                System.out.println(m);
            }else if (m==n){
                System.out.println(Math.min(2, n-1));
            }
        }
    }
}
