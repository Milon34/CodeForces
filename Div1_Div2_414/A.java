package Contest_Practice.Div1_Div2_414;



import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int result=0,a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int x=sc.nextInt();
            if (x>b&&x<c){
                result++;
            }
        }
        System.out.println(result);

    }
}
