//POLYMORPHISM OVERRIDDING

import java.util.*;

class A
{
    Scanner sc = new Scanner(System.in);
    int a=12;
    int s;
    public void show()
    {
        a=sc.nextInt();
        s=a;
        System.out.println("int a = "+s);
    }
}
class B extends A
{
    int b=sc.nextInt();
    int c=a+b;
    @Override
    public void show()
    {
        System.out.println("overridded :  "+c);
    }
}


public class oops_p9 {
    public static void main(String[] args)
    {   
        B bb=new B();
        bb.show();
    }
    
}
