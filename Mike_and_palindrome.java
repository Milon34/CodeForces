package Codeforces;



import java.util.Scanner;

public class Mike_and_palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        for (int i=0,j=s.length()-1;i<j;i++,j--){
            if (s.charAt(i)!=s.charAt(j)){
                count++;
            }
        }
        if (count==0&&s.length()%2!=0){
            System.out.println("YES");
            return;
        }
        if (count==1){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
