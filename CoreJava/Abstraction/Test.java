interface A{
    void a();
    void b();
    void c();
}

abstract class B implements A{
    public void a(){
        System.out.println("a method");
    }
}
class C extends B{

    public void b(){
        System.out.println("b method");
    }
    public void c(){
        System.out.println("c method");
    }
}
public class Test{
    public static void main(String[] args) {
        A a=new C();
        a.a();
        
    }
}