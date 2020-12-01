package Contest_Practice.div2_685;
import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n,k,charLength=27;
            n=sc.nextInt();
            k=sc.nextInt();
            String a,b;
            a=sc.next();
            b=sc.next();
            int aArray[]=new int[charLength];
            int bArray[]=new int[charLength];
            for (int i=0;i<n;i++){
                aArray[a.charAt(i)-'a']++;
                bArray[b.charAt(i)-'a']++;
            }
            boolean result=true;
            for (int i=25;i>=0;i--){
                aArray[i]+=aArray[i+1];
                bArray[i]+=bArray[i+1];
                int valueC=(aArray[i]-bArray[i])%k;
                if (aArray[i]>bArray[i]||valueC!=0){
                    result=false;
                }
            }
            if (result){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
