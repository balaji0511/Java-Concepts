class SuperParent {
    int ncnt=0;
    static int scnt=2;
    static{
        System.out.println("static block super parent");
        scnt++;
    }
    public SuperParent(){
        System.out.println("super parent constructor");
        superParentMethod();
        superParentStaticMethod();
    }
    public void superParentMethod(){
        System.out.println("non static method super parent");
        // System.out.println(staticVar);
    }
    public static void superParentStaticMethod(){
        System.out.println("static method super parent");
    }
}
