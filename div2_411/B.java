package Contest_Practice.div2_411;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=1;i<=t;i++){
            int val=i%4;
            if (val==1||val==2){
                System.out.print("a");
            }else {
                System.out.print("b");
            }

        }
        System.out.println();
    }
}
