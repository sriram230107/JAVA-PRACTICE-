//POLYMORPHISM

import java.util.Scanner;

class Hi
{
    public void show(int rn)
    {
        System.out.println("rn:"+rn);
    }
    public void show(int rn,String st)
    {
        System.out.println("st;"+st);
    }
    public void show(int rn,String st,String db)
    {
        System.out.println("db;"+db);
    }
}
public class oops_p8
{
   public static void main(String[] args)
   {
     Hi obj=new Hi();
     Scanner sc = new Scanner(System.in);
     int a=sc.nextInt();
     String b=sc.next();
     String c=sc.next();
     obj.show(a,b,c);
     sc.close();
   }
}
