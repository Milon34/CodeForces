package Contest_Practice.div3_690;

import java.util.ArrayList;
import java.util.Scanner;

public class C {
    static void findSmallest(int m, int s)
    {

        if (s > 9*m)
        {
            System.out.println("-1");
        }
        int[] res = new int[m];
        s -= 1;
        for (int i=m-1; i>0; i--)
        {
            if (s > 9)
            {
                res[i] = 9;
                s -= 9;
            }
            else
            {
                res[i] = s;
                s = 0;
            }
        }
        res[0] = s + 1;
        for (int i=0; i<m; i++)
            System.out.print(res[i]);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            if (n>45) {
                System.out.println(-1);
                continue;
            }
            ArrayList<Integer> list=new ArrayList<>();
            int max=9;
            while (n>0) {
                list.add(Math.min(max, n));
                n-= max;
                max--;
            }
            for (int i=list.size()-1; i>=0; i--)
                System.out.print(list.get(i));
            System.out.println();
        }
    }
}
