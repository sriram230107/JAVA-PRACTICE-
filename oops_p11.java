/**an array of integers nums and an integer target, return the indices of the two
numbers such that they add up to the target.**/

import java.util.*;

class indices
{
    int[] a=new int[5];
    Scanner sc=new Scanner(System.in);
    int s=0;
    int b=sc.nextInt();
    int[] c=new int[5];
    public void indic()
    {
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<5;j++)
        {
            for(int k=j+1;k<5;k++)
            {
                if(a[j]+a[k]==b)
                {
                    c[s]=j;
                    s=s+1;
                    c[s]=k;
                    s=s+1;
                }
            }
        }
        for(int g=0;g<c.length;g++)
        {
            System.out.println("indices"+g+" ;"+" "+c[g]);
        }
    }
}
public class oops_p11
{
    public static void main(String[] args)
    {
        indices ind=new indices();
        ind.indic();
    }
}
