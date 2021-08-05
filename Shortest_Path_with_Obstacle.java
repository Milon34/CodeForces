package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Shortest_Path_with_Obstacle {
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
        RealScanner sc = new RealScanner();
        int t = sc.nextInt();
        while (t-- > 0) {
            int ax, ay, bx, by, cx, cy;
            ax = sc.nextInt();
            ay = sc.nextInt();
            bx = sc.nextInt();
            by = sc.nextInt();
            cx = sc.nextInt();
            cy = sc.nextInt();
            if (ax == bx) {
                if (ax == cx) {
                    if (ay < by) {
                        int temp = ay;
                        ay = by;
                        by = temp;
                    }
                    if (cy > by && cy < ay) {
                        System.out.println((ay - by) + 2);
                        continue;
                    }
                }
            }
            if (ay == by) {
                if (ay == cy) {
                    if (ax < bx) {
                        int temp = ax;
                        ax = bx;
                        bx = temp;
                    }
                    if (cx > bx && cx < ax) {
                        System.out.println((ax - bx) + 2);
                        continue;
                    }
                }
            }
            System.out.println(Math.abs(ay - by) + Math.abs(ax - bx));
        }
    }
}

