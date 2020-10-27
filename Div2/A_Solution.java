package Contest_Practice.Div2;
import java.util.Scanner;
public class A_Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        for (int i=0;i<t;i++){
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            System.out.println(Math.max(a,Math.max(b,c)+1));
//            if ((b-a)==(c-b)){
//                int value=b-a;
//                System.out.println(c+value);
//            }
        }
    }
}
