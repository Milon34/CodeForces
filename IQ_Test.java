package Contest_Practice;
import java.util.Scanner;
public class IQ_Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[101];
        int n,a=0,b=0,c = 0,d = 0;
        n=sc.nextInt();
        for (int i=1;i<=n;i++) {
            arr[i]=sc.nextInt();
        }
        for (int i=1;i<=n;i++){
            if (arr[i]%2==0){
                a++;
                c=i;
            }else {
                b++;
                d=i;
            }
        }
        if (a==1){
            System.out.println(c);
        }else if (b==1){
            System.out.println(d);
        }

    }

}
class AlmostPrime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,amount=0;
        n=sc.nextInt();
        boolean[] b={false};
        int pFactors[]={0};
        for (int i=2;i<=n;i++){
            if (!b[i]){
                for (int j=i+1;j<=n;j++){
                    b[j]=true;
                    pFactors[j] +=1;

                }
            }
            if (pFactors[i]==2){
                amount +=1;
            }
        }
        System.out.println(amount);


    }
}