package Contest_Practice;

import java.util.Scanner;

public class TwoDimenArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),n=sc.nextInt();
        int[][] arr=new int[m][n];
        System.out.println("Enter element..");
        for (int i=0;i<m;i++){

            for (int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();

            }

        }
        System.out.println("Printing Element..");
        for (int i=0;i<m;i++){
            System.out.println();
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j]+"\t");
            }
        }

    }
}




class Main{
    public static void main(String[] args) {
        StringBuffer a=new StringBuffer("Hello");
        String b=fun(a).toString();
        System.out.println(a.toString()+b);
    }
    static String fun(StringBuffer a){
        String c="World";
        a=new StringBuffer();
        a.append(c);
        System.out.println(a);
        return c;
    }
}

class Mainrf{
    Mainrf(){
        System.out.println("Constructor of main");
    }
    static {
        System.out.println("static block of main");
    }
    {
        System.out.println("Instance block main");
    }
    public static void main(String[] args) {
        Greeting g=new Greeting();
        Mainrf m=new Mainrf();
    }
}
class Greeting{
    protected Greeting(){
        System.out.println("constructor of greeting");
    }
    {
        System.out.println("instance block greet");
    }
    static {
        System.out.println("static block of greeting");
    }


}