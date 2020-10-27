package Contest_Practice.TechnoCup;
import java.util.Scanner;
import java.util.Vector;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            Vector<Integer> vector=new Vector<Integer>();
            for (int i=0;i<n;i++) {
                vector.add(sc.nextInt());
            }

          for (int i=n-1;i>=n/2;i--){
              System.out.print(-vector.get(i)+" ");
          }
            for (int i = n / 2 - 1; i >= 0; --i)
                System.out.print(vector.get(i)+" ");
            }

        }

//            System.out.println(arr.length);

//
//            for (int i =0;i<n;i++){
//                System.out.println(arr[n-1]+" "+arr[n]+" "+ arr[i] + " " + arr[i + 1]);
//
//            }

        }


