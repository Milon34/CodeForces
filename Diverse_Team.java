package Codeforces;

import java.util.*;

public class Diverse_Team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        LinkedHashSet<Integer> h=new LinkedHashSet<>();
        LinkedList<Integer> l=new LinkedList<>();
        for (int i=0;i<n;i++){
            int a=sc.nextInt();
            h.add(a);
            l.add(a);
        }
        //System.out.println(h);
        List<Integer> list=new ArrayList<>();
        list.addAll(h);
//       Iterator<Integer> itr=h.iterator();
//       while (itr.hasNext()){
//           list.add(itr.next());
//       }
        if (h.size()<k){
            System.out.println("NO");
        }else {
            System.out.println("YES");
            for (int i=0;i<k;i++){
                System.out.print((l.indexOf(list.get(i))+1+" "));
            }

        }
    }
}
