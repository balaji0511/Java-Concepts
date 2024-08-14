class Child extends Parent {
    static int scnt=10;
    public Child(){
        int ncnt=5;
        System.out.println("scnt value"+scnt);
        {
            ncnt++;
        }
        System.out.println("child constructor");
        ChildMethod();
        ChildStaticMethod();
        System.out.println("ncnt value : "+ncnt);
    }
    public void ChildMethod() {
        System.out.println("non static method child");
    }
    public static void ChildStaticMethod(){
        System.out.println("static method child");
        System.out.println("scnt "+scnt);
    }
}

