//INHERITANCE 
import java.util.Scanner;
class A
{
    int a =23;
    String str="hello";
    Scanner sc=new Scanner(System.in);
    int b;
    public int show()
    {
        System.out.println("enter a number ; ");
        b=sc.nextInt();
        System.out.println(str);
        return a+b;
    }

}
class B extends A
{
    public void sr()
    {
        System.out.println("a/b is : "+a/b);
    }
}
public class oops_p4
{
    public static void main(String[] args) {
        B obj= new B();
        System.out.println(obj.show());
        obj.sr();
    }
}



