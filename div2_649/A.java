package Contest_Practice.div2_649;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- > 0) {
            int n, x;
            n = sc.nextInt();
            x = sc.nextInt();
            int arr[] = new int[n + 1];
            arr[0] = 0;
            int sum = 0;
            for (int i = 1; i <= n; ++i) {
                //arr[i] = sc.nextInt(); //arr[i] =arr[i]+ arr[i-1]=sc.nextInt();
                arr[i] += arr[i - 1];
                arr[i] = sc.nextInt();
            }

            int temp = 0, temp2 = 0;
            int a = 1;
            while ((arr[n] - arr[a - 1]) % x == 0 && a <= n) {
                ++temp;
                ++a;
            }
            a = n;
            while (arr[a] % x == 0 && a >= 1) {
                ++temp2;
                --a;
            }
            if (n - Math.min(temp, temp2) == 1) {
                System.out.println(n - Math.min(temp, temp2));
            } else {
                System.out.println(-1);
            }

//            for (int i=0;i<arr.length;i++){
//                sum=Math.max(0,)
//            }
//            if (sum%x!=0){
//                System.out.println(arr.length);
//            }else {
//                System.out.println(-1);
//            }
            // System.out.println();
        }
    }
//    int arr[]=new int[100005];
//
//    static void subArray( int n)
//    {
//        for (int i=0; i <n; i++)
//        {
//            for (int j=i; j<n; j++)
//            {
//                for (int k=i; k<=j; k++)
//                    System.out.print(a[k]+" ");
//            }
//        }
//    }
}
