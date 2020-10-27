package Contest_Practice;


    /**
     * author: derrick20
     * created: 10/5/20 9:10 AM
     */
import java.io.*;
import java.util.*;

public class test implements Runnable {
        public static void main(String[] args) throws Exception {
            new Thread(null, new test(), ": )", 1 << 28).start();
        }

        public void run() {
            FastScanner sc = new FastScanner();
            PrintWriter out = new PrintWriter(System.out);

            int N = sc.nextInt();
            int[][] events = new int[2 * N][2];

            for (int i = 0; i < N; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                int[] seg1 = {l, 0};
                int[] seg2 = {r, 1};
                events[2 * i] = seg1;
                events[2 * i + 1] = seg2;
            }
            Arrays.sort(events, (e1, e2) -> e1[0] != e2[0] ? Integer.compare(e1[0], e2[0]) : Integer.compare(e1[1], e2[1]));
            int bestYear = 0;
            int bestAmt = 0;
            int curr = 0;
            int ptr = 0;
            while (ptr < 2 * N) {
                int pos = events[ptr][0];
                while (ptr < 2 * N && events[ptr][0] == pos) {
                    if (events[ptr][1] == 0) {
                        curr += 1;
                    } else {
                        curr -= 1;
                    }
                    ptr += 1;
                }
                if (curr > bestAmt) {
                    bestAmt = curr;
                    bestYear = pos;
                }
            }
            out.println(bestYear + " " + bestAmt);
            out.close();
        }


        static class FastScanner {
            private int BS = 1 << 16;
            private char NC = (char) 0;
            private byte[] buf = new byte[BS];
            private int bId = 0, size = 0;
            private char c = NC;
            private double cnt = 1;
            private BufferedInputStream in;

            public FastScanner() {
                in = new BufferedInputStream(System.in, BS);
            }

            public FastScanner(String s) {
                try {
                    in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
                } catch (Exception e) {
                    in = new BufferedInputStream(System.in, BS);
                }
            }

            private char getChar() {
                while (bId == size) {
                    try {
                        size = in.read(buf);
                    } catch (Exception e) {
                        return NC;
                    }
                    if (size == -1) return NC;
                    bId = 0;
                }
                return (char) buf[bId++];
            }

            public int nextInt() {
                return (int) nextLong();
            }

            public int[] nextInts(int N) {
                int[] res = new int[N];
                for (int i = 0; i < N; i++) {
                    res[i] = (int) nextLong();
                }
                return res;
            }

            public long[] nextLongs(int N) {
                long[] res = new long[N];
                for (int i = 0; i < N; i++) {
                    res[i] = nextLong();
                }
                return res;
            }

            public long nextLong() {
                cnt = 1;
                boolean neg = false;
                if (c == NC) c = getChar();
                for (; (c < '0' || c > '9'); c = getChar()) {
                    if (c == '-') neg = true;
                }
                long res = 0;
                for (; c >= '0' && c <= '9'; c = getChar()) {
                    res = (res << 3) + (res << 1) + c - '0';
                    cnt *= 10;
                }
                return neg ? -res : res;
            }

            public double nextDouble() {
                double cur = nextLong();
                return c != '.' ? cur : cur + nextLong() / cnt;
            }

            public double[] nextDoubles(int N) {
                double[] res = new double[N];
                for (int i = 0; i < N; i++) {
                    res[i] = nextDouble();
                }
                return res;
            }

            public String next() {
                StringBuilder res = new StringBuilder();
                while (c <= 32) c = getChar();
                while (c > 32) {
                    res.append(c);
                    c = getChar();
                }
                return res.toString();
            }

            public String nextLine() {
                StringBuilder res = new StringBuilder();
                while (c <= 32) c = getChar();
                while (c != '\n') {
                    res.append(c);
                    c = getChar();
                }
                return res.toString();
            }

            public boolean hasNext() {
                if (c > 32) return true;
                while (true) {
                    c = getChar();
                    if (c == NC) return false;
                    else if (c > 32) return true;
                }
            }
        }
        static void ASSERT(boolean assertion, String message) {
            if (!assertion) throw new AssertionError(message);
        }
        static void ASSERT(boolean assertion) {
            if (!assertion) throw new AssertionError();
        }
    }

