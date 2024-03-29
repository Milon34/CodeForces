package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Vany_and_Cubes {
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
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        l.add(1);
        int sum=1,k=1;
        for (int i=1;i<=10000;i++){
            sum+=i+k;
            l.add(sum);
        }
        int valSum=0,count=0;
        if (n==1){
            System.out.println(1);
            return;
        }
        for (int i=1;i<=l.size();i++){
            valSum+=l.get(i-1);
            if (valSum>n){
                break;
            }
            count++;
        }

        System.out.println(count);
    }
}
