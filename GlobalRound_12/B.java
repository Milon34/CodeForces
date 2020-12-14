package Contest_Practice.GlobalRound_12;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       testCase: while (t-- > 0) {
            int n, k;
            n = sc.nextInt();
            k = sc.nextInt();
            int x[] = new int[n];
            int y[] = new int[n];

            for (int i = 0; i < n; i++) {
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();

            }
            MyLoop:
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (Math.abs(x[i] - x[j]) + Math.abs(y[i] - y[j]) > k) {
                        continue MyLoop;
                    }
                }
                System.out.println("1");
                continue testCase;
            }
           System.out.println("-1");

        }


//            int value[] = new int[n - 1];
//            int value1[] = new int[n - 1];
//            for (int i = 0; i < x.length - 1; i++) {
//                value[i] = Math.abs(x[i] - x[i + 1]);
//                value1[i] = Math.abs(y[i] - y[i + 1]);
//
//
//            }
//            int count = 0;
//            for (int i = 0; i < n; i++) {
//                if (value[i] + value1[i] > k) {
//                    System.out.println("-1");
//                    break;
//                }else if (k==1){
//                    System.out.println("-1");
//                    break;
//                }
//                else if (value[i] + value1[i] <= k){
//                    int val=0;
//                    count++;
//                   if (k==count){
//                       System.out.println(count);
//                       break;
//                   }else {
//                        val=Math.abs(k-count-1);
//                   }
//                    System.out.println(val);
//                   break;
//
//
//                }
////                System.out.println(count);
//            }

        }
    }

