package Contest_Practice.GlobalRound_12;
import java.util.*;

public class A {
    static void sort(char[] a) {
        ArrayList<Character> l=new ArrayList<>();
        for (char i:a){
            l.add(i);
        }
        Collections.sort(l);
        for (int i=0; i<a.length; i++) {
            a[i]=l.get(i);
        }
    }
    static void sort(int[] a) {
        ArrayList<Integer> l=new ArrayList<>();
        for (int i:a){
            l.add(i);
        }
        Collections.sort(l);
        for (int i=0; i<a.length; i++) {
            a[i]=l.get(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while ( t-- >0){
            int n;
            n=sc.nextInt();
           char[] c;
           c=sc.next().toCharArray();
           sort(c);
            System.out.println(c);

//            Arrays.sort(new String[]{s});
//            Vector <Character> c=new Vector<>();
//            for (int i=0;i<s.length();i++){
//                if (s.charAt(i)=='b'){
//                    System.out.print(s.charAt(i));
//                }else {
//                    c.add(s.charAt(i));
//                }
//            }
//            for (int i=0;i<c.size();i++){
//                System.out.print(c.elementAt(i)+"");
//            }

        }
    }
}
