package Contest_Practice;

import java.util.Scanner;

public class KombatTower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = new int[200005];
        while (t-- > 0) {
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = 0;
            int res =arr[1];

            for(int i=2;i<=n;i++){
                if(arr[i]==1) {
                    if (ans < 2) {
                        ans++;
                    }
                    else {
                        res++;
                        ans = 0;
                    }
                }
                else{
                    ans=0;
                }
            }

            System.out.println(res);
        }
    }
}
