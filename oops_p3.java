//abstraction
import java.util.*;
abstract class abc
{
    abstract void display();
}
class def
{
    void display()
    {
        System.out.println("ENTER THE NUMBER TO BE PRINTED ; ");
        Scanner sc = new Scanner(System.in);
        int b=sc.nextInt();
        System.out.println("hello its abstract method..!");
        System.out.println("input number is ;"+b);
    }
}
public class oops_p3
{
    public static void main(String[] args) {
        def a=new def();
        a.display();

    }
}