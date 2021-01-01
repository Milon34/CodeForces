package Contest_Practice.BetaRound_58;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class A {
//    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        char ch[]=sc.next().toCharArray();
//        char[] chHello = new char[5];
//        chHello[0] = 'h';
//        chHello[1] = 'e';
//        chHello[2] = 'l';
//        chHello[3] = 'l';
//        chHello[4] = '0';
        Character chHello[]={'h','e','l','l','o'};
        int j=-1;
        for (int i=0;i<ch.length;i++){
          if (ch[i]==chHello[j+1]){
              j++;
          }
          if (j==4){
              break;
          }
        }
        if (j==4){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}