package Contest_Practice.Educational_Round_101;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String x;
            x = sc.next();
            char ch[] = x.toCharArray();

            if (ch[0] == ')' || ch[x.length() - 1] == '(' || x.length() % 2!=0) {
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
            }
//            int i, k = 0, pVal = 0, qVal = 0;
//            if (ch[0] == ')' || ch[x.length() - 1] == '(') {
//                System.out.println("NO");
//            } else {
//                for (i = 0; i < x.length(); i++) {
//                    if (ch[i] == '?')
//                        k++;
//                    else if (ch[i] == '(')
//                        pVal++;
//                    else if (ch[i] == ')')
//                        qVal++;
//                }
//                if (pVal == qVal) {
//                    if (k == 0 || k % 2 == 0) {
//                        System.out.println("YES");
//                    } else {
//                        System.out.println("NO");
//                    }
//                } else {
//                    if (k == 0) {
//                        System.out.println("NO");
//                    } else {
//                        while (k-- > 0) {
//                            if (pVal > qVal)
//                                qVal++;
//                            else
//                                pVal++;
//                        }
//                        if (pVal != qVal) {
//                            System.out.println("NO");
//                        } else
//                            System.out.println("YES");
//                    }
//
//                }
            }
        }


