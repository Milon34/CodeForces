package Contest_Practice.Div2_664;
import java.util.Scanner;
public class A {
    public static boolean checkValue(int r,int g,int b,int w){
        int count = 0;
        if(r % 2 == 1){
            count++;
        }
        if(g % 2 == 1){
            count++;
        }
        if(b % 2 == 1){
            count++;
        }
        if(w % 2 == 1){
            count++;
        }
        if(count <= 1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int r,g,b,w;
            r=sc.nextInt();
            g=sc.nextInt();
            b=sc.nextInt();
            w=sc.nextInt();
            boolean res;
            if (checkValue(r, g, b, w)) {
                System.out.println("Yes");
            }else if ((r>0 && g>0 && b>0)&& checkValue(r-1,g-1,b-1,w-1)){
                System.out.println("Yes");
            }else {
                System.out.println("NO");
            }
        }
    }
}
