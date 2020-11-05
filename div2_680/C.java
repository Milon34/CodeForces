package Contest_Practice.div2_680;

import java.util.Scanner;
import java.util.Vector;

public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            long p, q;
            p=sc.nextLong();
            q=sc.nextLong();
            Vector<Long>div=new Vector<>();
            for (long i = 2; i * i <= q; ++i) {
                if (q % i == 0) {
                    div.add(i);
                    if (q / i != i)
                        div.add(q / i);
                }
            }
            div.add(q);
            long ans = 0;
            for (long a : div){
                long temp = p;
                while (temp % a == 0){
                    if (temp % q != 0 && p % temp == 0)
                    ans = Math.max(ans, temp);
                    temp /= a;
                }
                ans = Math.max(ans, temp);
            }
            System.out.println(ans);
        }
    }
}
