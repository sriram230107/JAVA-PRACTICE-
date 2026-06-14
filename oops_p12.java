//Given a string s, find the length of the longest substring without repeating characters.

import java.util.*;
public class oops_p12
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String data=sc.nextLine();
        String out="";
        int[] a=new int[50];
        for(int i=0;i<data.length();i++)
        {
            for(int j=i+1;j<data.length();j++)
            {
                if(data.charAt(i)==data.charAt(j))
                {
                    break;
                }
                if(data.charAt(i)!=data.charAt(j))
                {
                    out=out+data.charAt(j);
                    System.out.println("set is ;"+out);
                }
                
            }
            a[i]=out.length();
            out="";
        }
        int b=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    b=a[j];
                }
            }
        }
        System.out.println("largest possible string without repeating letters is : "+b);
    }
}