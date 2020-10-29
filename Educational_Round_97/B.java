package Contest_Practice.Educational_Round_97;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tt=sc.nextInt();
        while (tt-- >0){
            int n=sc.nextInt();
            String s=sc.next();

            s = "R" + s;
            s += "R";
            int ans1 = 0;
            int count = 0;
            for (int i = 0; i < n; ++i) {
                if (s.charAt(i) == '0' && s.charAt(i+1)== '0')
                count++;
                if (s.charAt(i+1) != '0') {
                    ans1 += count;
                    count = 0;
                }
            }
            int ans2 = 0;
            count = 0;
            for (int i = 0; i < n; ++i) {
                if (s.charAt(i) == '1' && s.charAt(i +1) == '1')
                    count++;
                if (s.charAt(i + 1) != '1') {
                    ans2 += count;
                    count = 0;
                }


            }
            System.out.println(Math.max(ans1, ans2));







//            int count=0;
//          for (int i=0;i<s.length();i++){
//                if (s.charAt(i)=='1'&& s.charAt(i+1)=='1') {
//                    String st[]=new String[1000];
//                    for (int j=s.charAt(i+1);j<s.length();j++) {
//                        if (s.charAt(j)=='0'&& s.charAt(j+1)=='0'){
//                            String finalString = String.valueOf(s.charAt(i+1));
//                            st[j]=finalString;
//                        }
//                    }
//           }

            }





        }

    }

