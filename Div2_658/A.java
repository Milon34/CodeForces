package Contest_Practice.Div2_658;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m, n;
            m = sc.nextInt();
            n = sc.nextInt();
            int mArr[] = new int[m];
            int nArr[] = new int[n];
            for (int i = 0; i < mArr.length; i++) {
                mArr[i] = sc.nextInt();
            }
            for (int i = 0; i < nArr.length; i++) {
                nArr[i] = sc.nextInt();
            }
            int count = 0, ans = 0;
            for (int i:mArr) {
                for (int j:nArr) {
                    if (i==j) {
                        count ++;
                        ans = i;
                        break;
                    }
                }
                if (count != 0) {
                    break;
                }

            }
            if (count !=0){
                System.out.println("YES");
                System.out.print("1"+" "+ans);
                System.out.println();
            }else {
                System.out.println("NO");
            }

        }
    }
}
