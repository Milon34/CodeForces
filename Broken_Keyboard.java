package Codeforces;



import java.util.Scanner;
import java.util.TreeSet;


public class Broken_Keyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
//            int[] arr = new int[26];
//            for (int i = 0; i < s.length(); i++) {
//                arr[s.charAt(i) - 'a']++;
//            }
           // String myS = "";
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] % 2 != 0) {
//                    myS += (char) (i + 'a');
//                }
//            }
            TreeSet<Character> h=new TreeSet<>();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                int count = 1;
                int j;
                for (j = i + 1; j < s.length(); j++) {
                    if (ch == s.charAt(j)) {
                        count++;
                    } else {
                        break;
                    }
                }
                i = j - 1;
                if (count % 2 != 0) {
                    h.add(ch);
                }
            }
//            char[] ch=myS.toCharArray();
           // Arrays.sort(ch);
         //   String per="";
//            for (int i = 0; i < ch.length; i++) {
//                per += (char) ch[i];
//            }
//            System.out.println(per);
            if (h.size()==0){
                System.out.println();
            }else {
                for (char ch:h){
                    System.out.print(ch);
                }
                System.out.println();
            }
        }
    }
}
