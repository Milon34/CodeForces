package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chunga_Changa {
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
        long x,y,z;
        x=sc.nextLong();
        y=sc.nextLong();
        z=sc.nextLong();
        long sum=0;
        if (x%z==0&&y%z==0){
            sum+=(x/z)+(y/z);
        }else{
            sum+=(x/z)+(y/z)+((x%z+y%z)/z);
            //sum+=Math.max(x,y)%z;
        }
        long rem=Math.max(x%z,y%z);
        long balance=0;
        if (x%z+y%z>=z){
            balance=z-rem;
        }
        System.out.println(sum+" "+balance);
    }
}
