public class Main {
    public static void main(String[] args){
        Student s1=new Student();
        s1.setName("balaji");
        s1.setAge(21);
        s1.setPlace("puttur");
        System.out.println("--------");
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getPlace());
        System.out.println("---------");
        s1.display();
    }   
}


