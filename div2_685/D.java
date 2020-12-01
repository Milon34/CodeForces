package Contest_Practice.div2_685;
import java.util.Scanner;
public class D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            long d,k,pFinalVal;
            d=sc.nextLong();k=sc.nextLong();
            long xVal=0,yVal=0;
            for(long i=1; ;i++)
            {
                if(i%2!=0)
                {
                    xVal+=k;
                }
                else
                {
                    yVal+=k;
                }
                if((xVal*xVal)+(yVal*yVal)>d*d)
                {
                    pFinalVal=i;
                    break;
                }
            }
            if(pFinalVal%2==0)
            {
                System.out.println("Ashish");
            }
            else
                System.out.println("Utkarsh");
        }
    }
}
