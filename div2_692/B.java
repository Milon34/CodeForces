package Contest_Practice.div2_692;

import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            long n=sc.nextLong();
            long iVal,dVal,value=0;
            dVal=n;
            while (n!=0){
                value+=n%10;
                n/=10;
            }
            if (value==1){
                System.out.println(dVal);
            }
            else {
                long p,q,flagValue;
                for (iVal=dVal; ;iVal++){
                    q=iVal;
                    flagValue=0;
                    while (q!=0){
                        p=q%10;
                        q/=10;
                        if (p!=0&&iVal%p!=0){
                            flagValue=1;
                            break;
                        }
                    }
                    if (flagValue==0){
                        System.out.println(iVal);
                        break;
                    }
                }
            }

        }
    }
}
