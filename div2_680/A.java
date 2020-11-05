package Contest_Practice.div2_680;

import java.util.*;

public class A {
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n,x;
            n=sc.nextInt();
            x=sc.nextInt();

            ArrayList<Integer> arr1=new ArrayList<>();
            ArrayList<Integer> arr2=new ArrayList<>();
            for (int i=0;i<n;i++){
              arr1.add(sc.nextInt());

            }for (int i=0;i<n;i++){
                arr2.add(sc.nextInt());
            }
            Collections.sort(arr1);
            Collections.sort(arr2,Collections.reverseOrder());

            boolean z=true;

            for(int i=0;i<n;i++)
            {
                if((arr1.get(i)+arr2.get(i))>x)
                {
                    z=false;
                    break;
                }

            }



            System.out.println((z)? "YES":"NO");
//            int s=getMax(arr1);
//            //System.out.println(s);
//            int s_=getMin(arr2);
//            if (s+s_<=x){
//                System.out.println("YES");
//            }else {
//                System.out.println("NO");
//            }


        }
    }
}
