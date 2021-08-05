package Codeforces;

import java.util.Scanner;

public class Game_of_Life {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();
            char[] ch=sc.next().toCharArray();
            while (k-->0){
                for (int i=1;i<ch.length-1;i++){
                    if (ch[i-1]!=ch[i+1]){
                        if (ch[i-1]=='0'){
                            ch[i-1]='1';
                        }
                        if (ch[i+1]=='0'){
                            ch[i+1]='1';
                        }
                    }
                }
            }
            String per= String.valueOf(ch);
            System.out.println(per);
        }
    }
}
