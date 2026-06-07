import java.util.Scanner;
class a
{
    int a;
    Scanner sc =new Scanner(System.in);
    public int display()
    {
        System.out.println("Enter a number 1 ;");
        a=sc.nextInt();
        return a;

    }
    //System.out.println("hi");
}
class b extends a
{
    public int disp()
    {
        display();
        int b;
        System.out.println("Enter a number 2 ;");
        b=sc.nextInt();
        return a+b;
    }
}

public class oops_p1 
{
    public static void main(String[] args)
    {
        b obj=new b();
        System.out.println(obj.disp());
    }
}