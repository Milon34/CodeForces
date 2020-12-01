package Contest_Practice.EducationalRound_99;
import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int value=0,p=0,ans;
            for(int i=1;i<=x;i++)
            {
                value+=i;
                if(value>=x)
                {
                    p=i;
                    break;
                }
            }
            ans=p;
            if (value-x==1){
                ans=p+1;
            }
            System.out.println(ans);

        }
    }
}
