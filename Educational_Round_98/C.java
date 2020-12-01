package Contest_Practice.Educational_Round_98;

import java.util.Scanner;
import java.util.Stack;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s;
            s = sc.next();
            int i, f = 0, count = 0, wCon = 0, dCon = 0, pCon = 0, qCon = 0, r = 0;
            for (i = 0; i < s.length(); i++) {
                if (f == 1) {
                    if (s.charAt(i) == ')') {
                        pCon++;
                    }
                    if (count > pCon && pCon != 0) {
                        wCon += pCon;
                        count -= pCon;
                        pCon = 0;
                    } else if (count <= pCon && count != 0) {//Final Statement
                        wCon += count;
                        pCon -= count;
                        count = 0;
                    }
                    if (count == pCon && pCon == 0)
                        f = 0;
                }
                if (s.charAt(i) == '(') {
                    count++;
                    f = 1;
                }
                if (dCon == 1) {
                    if (s.charAt(i) == ']') {
                        r++;
                    }
                    if (qCon > r && r != 0) {
                        wCon += r;
                        qCon -= r;
                        r = 0;

                    } else if (r >= qCon && qCon != 0) {
                        wCon += qCon;
                        r -= qCon;
                        qCon = 0;


                    }
                    if (r == qCon && qCon == 0)
                        dCon = 0;

                }


                if (s.charAt(i) == '[') {
                    qCon++;
                    dCon = 1;
                }
            }
            System.out.println(wCon);

        }

    }
}