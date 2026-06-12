//final , super
import java.util.*;
class A
{
    private int a=12;
    void show()
    {
        System.out.println("a = "+a);
    }
}
class B extends A
{
    Scanner sc = new Scanner(System.in);
    int a;
    void show()
    {
        System.out.println("Enter a number ; ");
        a=sc.nextInt();
        System.out.println("a= "+a);
        super.show();
    }
}



public class oops_p10 {
    public static void main(String[] args)
    {
        B bb =new B();
        bb.show();
    }
    
}
