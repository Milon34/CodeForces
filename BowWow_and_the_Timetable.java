package Codeforces;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class BowWow_and_the_Timetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        BigInteger val=new BigInteger(s,2);
       // System.out.println(val);
        BigInteger[] arr = new BigInteger[10001];
        BigInteger m=new BigInteger("4");
        for (int i = 0; i <= 10000; i++) {
            arr[i] = m.pow(i);
        }
        //System.out.println(Arrays.toString(arr));
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (val.compareTo(arr[i])==1){
                count++;
            }else {
                break;
            }
        }
        System.out.println(count);
    }
}
