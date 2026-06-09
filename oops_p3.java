//abstraction
import java.util.*;
abstract class abc
{
    abstract void display();
}
class def extends abc
{
    Scanner sc = new Scanner(System.in);
    @Override
    public void display()
    {
        System.out.println("ENTER THE NUMBER TO BE PRINTED ; ");
        int b=sc.nextInt();
        System.out.println("hello its abstract method..!");
        System.out.println("input number is ;"+b);
    }
}
public class oops_p3
{
    public static void main(String[] args) {
        abc a=new def();
        a.display();

    }
}