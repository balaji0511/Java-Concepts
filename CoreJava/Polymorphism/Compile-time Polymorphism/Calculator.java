class Calculator{
    public Calculator(){
        System.out.println("This is calculator");
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int ...a){
        int sum=0;
        for(int i:a){
            sum+=i;
        }
        return sum;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static double sub(double a,double b){
        return a-b;
    }
}