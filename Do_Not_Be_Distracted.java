package Codeforces;

import java.util.Scanner;

public class Do_Not_Be_Distracted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String myS=sc.next();
            boolean check=true;
            String s=myS.charAt(0)+"";
            int val=-1;
            for (int i=1;i<myS.length();i++){
                if (myS.charAt(i)!=myS.charAt(i-1)){
                    s+=myS.charAt(i);
                }
            }
           // System.out.println(s);
            m:for (int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                for (int j=i+1;j<s.length();j++){
                    if (ch==s.charAt(j)){
                        check=false;
                        break m;
                    }
                }
            }
            if (check){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
