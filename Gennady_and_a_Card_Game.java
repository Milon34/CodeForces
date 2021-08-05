package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gennady_and_a_Card_Game {
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
        String s=sc.next();
        String[] arr=new String[5];
        for (int i=0;i<5;i++){
            arr[i]=sc.next();
        }
        boolean check=false;
        for (int i=0;i<arr.length;i++){
            String myS=arr[i];
            for (int j=0;j<myS.length();j++){
                if (s.charAt(j)==myS.charAt(j)){
                    check=true;
                    break;
                }
            }
        }
        if (check){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
