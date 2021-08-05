package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Phoenix_and_Beauty {
    static class RealScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) {
        RealScanner sc=new RealScanner();
        int t=sc.nextInt();
        while (t-->0){
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();
            int[] arr=new int[n];
            Set<Integer> l=new HashSet<>();
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                l.add(arr[i]);
            }
            if (l.size()>k){
                System.out.println(-1);
            }else {
                System.out.println(n*k);
                for (int i=0;i<n;i++){
                    for (int s:l){
                        System.out.print(s+" ");
                    }
                    for (int s=0;s<k-l.size();s++){
                        System.out.print(1+" ");
                    }
                }
                System.out.println();
            }
//            int m=0,per=0;
//            List<Integer> lm=new ArrayList<>();
//            for (int i=0;i<n-k+1;i++){
//                int sum=0;
//                for (int j=0;j<k;j++){
//                    sum+=l.get(i+j);
//                }
//                lm.add(sum);
//                if (m!=0&&sum!=lm.get(per)){
//                    l.add(i+k-1,l.get(i-1));
//                }
//                if (m==0){
//                    m=1;
//                    continue;
//                }
//                per++;
//                m++;
//            }
//            System.out.println(l);
        }
    }
}