package Contest_Practice.div3_686;
import java.util.ArrayList;
import java.util.Scanner;

public class C {
    static int tryCount(ArrayList<Integer> a, int n) {
        if (a.isEmpty()){
            return Integer.MAX_VALUE;
        }
        int count=0;
        for (int i=0; i+1<a.size(); i++){
            if (a.get(i)+1!=(int)a.get(i+1)) {
                count++;
            }
        }
        if (a.get(0)!=0) {
            count++;
        }
        if (a.get(a.size()-1)!=n-1){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){

            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for (int i=0;i<n;i++){
                arr[i]--;
            }
            ArrayList<Integer>[] al=new ArrayList[n];
            for (int i=0;i<n;i++){
                al[i]=new ArrayList<>();
            }
            for (int i=0;i<n;i++){
                al[arr[i]].add(i);
            }
            int best=Integer.MAX_VALUE;
            for (ArrayList<Integer> i:al){
//                System.out.println(tryCount(i, al.length));
                best=Math.min(best, tryCount(i, al.length));
            }
            System.out.println(best);
        }
    }
}
