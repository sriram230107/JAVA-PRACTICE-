/** Given a string s containing only the characters '(', ')', '{', '}', '[', and ']', 
 determine if the input string is valid.**/

import java.util.*;


 public class oops_p13
 {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    String str = ""+sc.next();
    int a=str.length()%2;
    int count=0;
    if(a!=0)
    {
        System.out.println("incorrect braces..!");
    }
    else
    {
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)=='(')
            {
                if(str.charAt(i)==(str.charAt(str.length()-1-i))-1)
                {
                    count=1;
                }
                else
                {
                    count=0;
                    break;
                }
            }
            else if(str.charAt(i)=='{' ||str.charAt(i)=='[')
            {
                if(str.charAt(i)==(str.charAt(str.length()-1-i))-2)
                {
                    count=1;
                }
                else
                {
                    count=0;
                    break;
                }
            }
            else
            {
                count=0;
                break;
            }
        }
        if(count==0)
        {
            for(int i=0;i<str.length();i=i+2)
            {
                if(str.charAt(i)=='(')
                {
                    
                    if(str.charAt(i)==(str.charAt(i+1))-1)
                    {
                        count=1;
                    }
                    else
                    {
                        count=0;
                        break;
                    }
                }
                else if(str.charAt(i)=='{' ||str.charAt(i)=='[')
                {
                    
                    if(str.charAt(i)==(str.charAt(i+1))-2)
                    {
                        count=1;
                    }
                    else
                    {
                        count=0;
                        break;
                    }
                }
                else
                {
                    count=0;
                    break;
                }
            }
        }
        if(count!=0)
        {
            System.out.println("it has correct pair of braces..!");
        }
        else if(count==0)
        {
            System.out.println("incorrect braces..!");
        }
    }
    }
 }
