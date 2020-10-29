package Contest_Practice.Div2_662;

import java.util.Scanner;
import java.util.Vector;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tt=sc.nextInt();
        //Vector<Integer> cnt=new Vector<Integer>();
        int cnt[]=new int[100005];
        //Object[] arr = new Object[100005];

        int q,a,count1=0,count2=0;
        char symbol;
        while (tt-- >0){
             a=sc.nextInt();
            count1=count1-(cnt[a]/2);

           count2=count2-(cnt[a]/4);

            cnt[a]++;

            count1=count1+(cnt[a]/2);
            count2=count2+(cnt[a]/4);
        }
        q=sc.nextInt();
        for (int i=0;i<q;i++){
            symbol=sc.next().charAt(0);
            a=sc.nextInt();
            count1=count1-(cnt[a]/2);
            count2=count2-(cnt[a]/4);
            if (symbol=='+'){
               // cnt.get(a)++;
                cnt[a]++;
            }else {
                //cnt.get(a)--;
                cnt[a]--;
            }
            count1=count1+(cnt[a] /2);
            count2=count2+(cnt[a] /4);
            if (count1>=4 && count2>=1){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
