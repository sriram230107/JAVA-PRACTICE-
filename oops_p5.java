// INTERFACES
interface HI
{
    int a=10;
    int b=25;
    int sum();
}
interface Hello extends HI 
{
    int a=11;
    int b=26;
    void display();
}
class HELP implements Hello
{
    int c;
    public int sum()
    {
        c=HI.a+HI.b;
        return c;
    }
    public void display()
    {
        System.out.println(Hello.a+" "+Hello.b);
    }
}
public class oops_p5
{
    public static void main(String[] args)
    {
        HELP H=new HELP();
        System.out.println(H.sum());
        H.display();
    }

}
