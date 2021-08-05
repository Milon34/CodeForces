package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Same_Differences {
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
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            long n = sc.nextInt();
//            long count = 0;
//            for (int i = 1; i <= n; i++) {
//                long a = sc.nextLong();
//                if (a == i) {
//                    count++;
//                }
//            }
//            System.out.println(((count - 1) * (count)) / 2);
//            // System.out.println(count);
//        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextInt();
            long count = 0;
            Map<Long, Long> m = new HashMap<>();
            int[] arr=new int[100005];
            for (long i = 1; i <= n; i++) {
                long a = sc.nextLong();
                m.put(a-i,m.getOrDefault(a-i,0l)+1);
            }
            List<Long> l= new ArrayList<>();
            l.addAll(m.values());
            //System.out.println(l);
            for (long i=0;i<l.size();i++){
                long val=l.get((int) i);
                count+=((val-1)*val)/2;
            }
            //System.out.println(((count - 1) * (count)) / 2);
             System.out.println(count);
        }
    }
}
