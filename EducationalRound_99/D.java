package Contest_Practice.EducationalRound_99;
import java.util.Scanner;

public class D {
    public  static int arraySortedOrNot(int arr[], int n)
    {
        if (n == 1 || n == 0)
            return 1;

        if (arr[n - 1] < arr[n - 2])
            return 0;
        return arraySortedOrNot(arr, n - 1);
    }
    public  static boolean  isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int i, n, x, p, count = 0;
            n = sc.nextInt();
            x = sc.nextInt();
            int arr[] = new int[n];
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] > x) {
                    p = arr[i];
                    arr[i] = x;
                    x = p;
                    ++count;
                }
            }
            if (isSorted(arr)){
                System.out.println(count);
            }else {
                System.out.println("-1");
            }
        }
    }
}
