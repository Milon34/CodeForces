package Contest_Practice.div2_685;
import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n,q;
            n=sc.nextInt();q=sc.nextInt();
            String s;
            s=sc.next();
            int i,j,k,l,r;
            for(i=1;i<=q;i++)
            {
                l=sc.nextInt();r=sc.nextInt();
                if(l==1&&r==s.length())
                {
                    System.out.println("NO");
                }
                else
                {
                    char p = 0,qFlow = 0;
                    int flag=0;
                    if(l!=1)
                    {
                        p=(char) (l-2);
                    }
                    if(r!=s.length())
                    {
                        qFlow= (char) r;
                    }
                    char n1,m1;
                    n1=s.charAt(l-1);
                    m1=s.charAt(r-1);
                    if(l==1)
                    {
                        for(j=qFlow;j<s.length();j++)
                        {
                            if(m1==s.charAt(j))
                            {
                                flag=1;
                                break;
                            }
                        }
                    }
                    else if(l!=1&&r==s.length())
                    {
                        for(j=p;j>=0;j--)//p
                        {
                            if(n1==s.charAt(j))
                            {
                                flag=1;
                                break;
                            }
                        }
                    }
                    else if(l!=1)
                    {
                        for(j=p;j>=0;j--)
                        {
                            if(n1==s.charAt(j))
                            {
                                flag=1;
                                break;
                            }
                        }
                        for(j=qFlow;j<s.length();j++)
                        {
                            if(m1==s.charAt(j))
                            {
                                flag=1;
                                break;
                            }
                        }
                    }
                    if(flag==1)
                    {
                        System.out.println("YES");
                    }
                    else
                        System.out.println("NO");
                }

            }
        }
    }
}