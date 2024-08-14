class Parent extends SuperParent {
    {
        ncnt++;
    }
    public Parent() {
        System.out.println("parent constructor");
        ParentMethod();
        ParentStaticMethod();
    }

    public void ParentMethod() {
        System.out.println("non static method parent");
    }

    public static void ParentStaticMethod() {
        System.out.println("static method parent");
        System.out.println("scnt "+scnt);
    }
}
