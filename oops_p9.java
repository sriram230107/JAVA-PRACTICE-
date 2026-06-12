//POLYMORPHISM OVERRIDDING

import java.util.*;

class A
{
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int s;
    public void show()
    {
        s=a;
        System.out.println("int a = "+s);
    }
}
class B extends A
{
    Scanner sc = new Scanner(System.in);
    int b=sc.nextInt();
    int c=a+b;
    public void show()
    {
        System.out.println("int a + int b = "+c);
    }
}


public class oops_p9 {
    public static void main(String[] args)
    {
        B bb=new B();
        bb.show();
    }
    
}
