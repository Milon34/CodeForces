package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ternary_String {
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
    public static final class Pair<T1, T2> {
        public T1 first;
        public T2 second;

        public Pair() {
            first = null;
            second = null;
        }

        public Pair(T1 firstValue, T2 secondValue) {
            first = firstValue;
            second = secondValue;
        }

        public Pair(Pair<T1, T2> pair) {
            first = pair.first;
            second = pair.second;
        }

    }
    public static void main(String[] args) {
        RealScanner sc=new RealScanner();
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int check=-1;
            List<Pair<Character,Integer>> l=new ArrayList<>();
            for (int i=0;i<s.length();i++){
                if (check==-1||l.get(check).first!=s.charAt(i)){
                    l.add(new Pair<>(s.charAt(i),1));
                    check++;
                }else {
                    l.get(check).second++;
                }
            }
            //System.out.println(check);
            for (Pair<Character,Integer> i:l){
                System.out.println(i.first+" "+i.second);
            }
            int max=Integer.MAX_VALUE;
            for (int i=1;i<check;i++){
                if (l.get(i-1).first!=l.get(i+1).first){
                    max=Math.min(max,l.get(i).second+2);
                }
            }
            if (max==Integer.MAX_VALUE){
                System.out.println(0);
            }else {
                System.out.println(max);
            }
        }
    }
}