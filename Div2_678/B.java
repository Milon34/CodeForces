package Contest_Practice.Div2_678;
import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n =sc.nextInt();
            int arr[][]=new int[n+1][n+1];
            for (int i=1;i<=n;i++){
                for (int j = 1; j <= n; ++j){
                    if (i == j) {
                        arr[i][j] = 4;
                    }
                    else if (i + j == n + 1) {
                        arr[i][j] = 9;
                    }
                    else {
                        arr[i][j] = 0;
                    }
                }
            }

            if ((n &1)==1){
                arr[n / 2 + 1][n / 2 + 1] = 9;
                arr[1][n / 2 + 1] = 4;
                arr[n / 2 + 1][1] = 4;
            }
            for (int i = 1; i <= n; ++i){
                for (int j = 1; j <= n; ++j) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
