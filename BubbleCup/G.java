package Contest_Practice.BubbleCup;
import java.util.Scanner;
public class G {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s=0;
        for (int i=0;i<t;i++){
            int b,d;
            b=sc.nextInt();
            d=sc.nextInt();
            if (b<d){
                s+=b;
            }
        }
        s=s/t;
        System.out.println(s+" 2");
    }
}
