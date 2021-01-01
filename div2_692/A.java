package Contest_Practice.div2_692;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            char[] ch=sc.next().toCharArray();
            int count=0;
            for (int i=n-1;i>=0;i--){
                if (ch[i]==')'){
                    count++;

                }else {
                    break;
                }
            }
            if (count>(ch.length-count)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
