package Contest_Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BeautifullString {
    public static void main(String[] args) {
        RealScanner sc=new RealScanner();
        int t=sc.nextInt();
        while (t-- >0){
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();
            String[] s=new String[n];
            for ( int i=0;i<n;i++){
                    s[i] ="a";

            }

            for (int i = n - 2; i >= 0; i--) {
                if (k <= (n - i - 1)) {
                    s[i] = "b";
                    s[n - k] = "b";
                    for (String str : s) {
                        System.out.print(str);
                    }
                    System.out.println();
                    break;
                }
                k -= (n - i - 1);
            }

        }

    }
    static void sort(int[] a) {
        ArrayList<Integer> l=new ArrayList<>();
        for (int i:a){
            l.add(i);
        }
        Collections.sort(l);
        for (int i=0; i<a.length; i++){
            a[i]=l.get(i);
        }
    }

    static class RealScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++){
                a[i]=nextInt();
            }
            return a;
        }

    }


}

