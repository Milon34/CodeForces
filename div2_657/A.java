package Contest_Practice.div2_657;

import java.util.Scanner;

public class A {
static String p="abacaba";
public static int isCount(String s){
    int count=0;
    for (int i=0;i<s.length()-6;i++){
        if (s.substring(i, 7).equals(p)){
            count++;
        }
    }
    return  count;
}
public  static  void process(String s){
    for ( int i=0;i<s.length();i++){
        if (s.charAt(i)=='?'){
            System.out.println("z");
        }else {
            System.out.println(s.charAt(i));
        }
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            String s=sc.next();
            int k=isCount(s);
            boolean ok=false;
            if (k>1){
                System.out.println("No");
                ok=true;
            }else  if (k==1){
                System.out.println("Yes");
                process(s);
                ok=true;
            }else {
                for (int i=0;i<s.length()-6;i++){
                    if (ok){
                        break;
                    }
                    String str=s;
                    boolean temp=false;
                    for (int j=0;j<7;j++){
                        if (str.charAt(i+j)!='?'&&str.charAt(i+j)!=p.charAt(j)){
                            temp=true;
                            break;
                        }
//                        str.charAt(i+j)=p.charAt(j);
                    }
                    if (!temp&&isCount(str)==1){
                        System.out.println("Yes");
                        process(str);
                        ok=true;
                    }
                }
            }
            if (!ok){
                System.out.println("No");
            }
        }
    }
}
