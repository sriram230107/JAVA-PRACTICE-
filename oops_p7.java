// static 

class M
{
    static int x=10;
    static 
    {
        System.out.println(x);
    }
}
public class oops_p7 {
    public static void main(String[] args)
    {
        System.out.println(M.x);
    }
}
