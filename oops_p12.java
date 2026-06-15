//Given a string s, find the length of the longest substring without repeating characters.

import java.util.*;

public class oops_p12
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int max=0;
        for(int i=0;i<str.length();i++)
        {
            String ch=""+str.charAt(i);
            System.out.println("set of all substrings: "+ch);
            for(int j=i+1;j<str.length();j++)
            {
                if(ch.indexOf(str.charAt(j)) == -1)
                {
                    ch=ch+str.charAt(j);
                    System.out.println("set of all substrings: "+ch);
                }
                else
                {
                    break;
                }

            }
            if(ch.length()>max)
            {
                max=ch.length();
            }
            System.out.println("longest substring set is : "+ch);
        }
        System.out.println("maximum possible longest chain is ; "+max);
        
    }
}