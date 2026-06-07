class A
{
    int a;
    int b;
    A(int a,int b)
    {
        this.a=a;
        this.b=b;
        
    }
    public int add()
    {
        return a+b;
    }
}
public class oops_p2 {
    public static void main(String[] args) {
        A o=new A(10,20);
        A ob=new A(30,40);
        System.out.println(o.add());
        System.out.println(ob.add());       
        
    }
    
}
