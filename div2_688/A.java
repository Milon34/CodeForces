package Contest_Practice.div2_688;

import java.util.Scanner;

public class A {
    public static int getOccurrences(int[] numbers)
    {
        int count = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            int currentInt = numbers[i];;

            if (currentInt == numbers[i])
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       while ( t-- >0){
           int n,m;
           n=sc.nextInt();
           m=sc.nextInt();
           int arr[]=new int[n];
           int arr2[]=new int[m];
//           int count=0;
           for (int i=0;i<n;i++){
               arr[i]=sc.nextInt();
           }
           for (int i=0;i<m;i++){
               arr2[i]=sc.nextInt();
           }
           int count = 0;
           for(int z = 0; z <n; z++)
           {
               for(int y = 0; y <m; y++)
               {
                   if(arr[z] == arr2[y])
                   {
                       count++;
                   }
               }
           }
           System.out.println(count);

       }
    }
}
