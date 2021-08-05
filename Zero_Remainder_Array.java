package Codeforces;

import java.util.*;

public class Zero_Remainder_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Map<Long,Integer> m=new HashMap<>();
            long res=0;
            for (int i:arr){
                long add=((k-i%k)+k)%k;
                if (add==0){
                    continue;
                }
                int time=m.getOrDefault(add,0);
                m.put(add,time+1);
                add+=(long) k*time;
                System.out.println(time+" "+add);
                res=Math.max(res,add+1);
            }
            System.out.println(m);
            System.out.println(res);
        }
    }
}
