// ENCAPSULATION 
import java.util.*;

class Help
{
    Scanner sc=new Scanner(System.in);
    private int a=sc.nextInt();
    private int c;
    int b;
    Help(int b)
    {
        this.b=b;
    }
    public int summ()
    {
        c=a+b;
        return c;
    }
}
public class oops_p6
{
    public static void main(String[] args)
    {
        Help h=new Help(10);
        System.out.println(h.summ());
    }
}