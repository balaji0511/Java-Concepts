public class Main {
    public static void main(String[] args) {
        Bank b=new Bank();
        System.out.println(b);
        System.out.println(b.getROI());

        b=new SBI();
        System.out.println(b);
        System.out.println(b.getROI());

        b=new AXIS();
        System.out.println(b);
        System.out.println(b.getROI());
        
    }
}
