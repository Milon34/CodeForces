package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Good_Subarrays {
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
            int n=sc.nextInt();
            String s=sc.next();
            Map<Long,Long>m=new HashMap<>();
            m.put(0L,1L);
            long sum=0,res=0;
            for (int i=0;i<s.length();i++){
                sum+=s.charAt(i)-'0';
                long key=sum-i-1;
                if (!m.containsKey(key)){
                    m.put(key,0L);
                }
                m.put(key,m.getOrDefault(key,0L)+1);
             //   System.out.println(m);
                res+=m.get(key)-1;
            }
            System.out.println(res);
        }
    }
}
