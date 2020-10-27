package Contest_Practice;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while (t-- >0){
            int n;
            n=sc.nextInt();
            long cur=0;
            for ( int i=0;i<n;i++){
                long x;
                x=sc.nextLong();
                cur=Math.max(0L,cur+x);
            }
            System.out.println(cur);
        }
    }
}
class CommonSubsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        Boolean[] vis=new Boolean[10005];
        int arr[]=new int[10005];
        while(t-- >0){
            int m,n;
            n=sc.nextInt();
            m=sc.nextInt();
            for (int i = 0; i <n ; i++) {
                arr[i]=sc.nextInt();
                vis[arr[i]]=true;

            }
            int e=-1;
            try {
                for(int j=0;j<m;j++){
                    int b=sc.nextInt();
                    if(vis[b])
                        e=b;

                }
            } catch (Exception f) {
                //f.printStackTrace();
                System.out.println(f);
            }

            for(int i=0;i<n;i++){
                vis[arr[i]]=false;
            }
            if(e==-1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES\n"+e);
            }



        }
    }

}