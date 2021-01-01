package Contest_Practice.Educational_Round_100;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n;
            n = sc.nextLong();
            long arr[] = new long[(int) n+10];
            long fArray[] = new long[(int) (n)+10];
            long gArray[] = new long[(int) (n)+10];
            long sum1 = 0, sum2 = 0;
            for (int i = 0; i < n; i++) {
                arr[ i] = sc.nextLong();
                if (i % 2 == 0) {
                    fArray[(int) i] = 1;
                    gArray[(int) i] = arr[(int) i];
                } else {

                    fArray[(int) i] = arr[(int) i];
                    gArray[(int) i] = 1;
                }
                sum1 += Math.abs(arr[i] - fArray[(int) i]);
                sum2 += Math.abs(arr[(int) i] - gArray[(int) i]);

            }
            if (sum1 <= sum2) {
                for (long l=0 ;l<n;l++) {
                    System.out.print(fArray[(int) l]+ " ");
                }
            } else {
                for (long l=0;l<n;l++) {
                    System.out.print(gArray[(int) l] + " ");
                }
            }
//            {
//                for (long i = 0; i < n; i++) {
//                    if (arr[(int) i] % 2 != 0) {
//                        arr[(int) i] = arr[(int) i] + 1;
//                    }
//                }
//                for (long i = 0; i < n - 1; i++) {
//                    if (arr[(int) i] % arr[(int) (i + 1)] == 0) {
//
//                    } else if (arr[(int) (i + 1)] % arr[(int) i] != 0) {
//
//                        while (arr[(int) i] != arr[(int) (i + 1)]) {
//                            if (arr[(int) i] < arr[(int) (i + 1)]) {
//
//                                arr[(int) (i + 1)]--;
//                            } else {
//                                arr[(int) i]--;
//                            }
//                        }
//                    }
//                }
//
//                for (long i = 0; i < n; i++) {
//                    System.out.print(arr[(int) i] + " ");
//                }
//            }
//            }else {
//                for (int i = 0; i < ((n+1)/2)-1; i++) {
//                    System.out.print('2' + " 1" + " ");
//                }
//                System.out.print("2");
//            }
            System.out.println();
//            if (arr.length=='2'){
//                for (int i=0;i<n;i++){
//                    System.out.print("1"+" ");
//                }
//            }else {
//
//            }

        }
    }
}
