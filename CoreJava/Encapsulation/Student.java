class Student{
    private String name;
    private int age;
    private String place;

    public Student(){
        System.out.println("student constructor");
        System.out.println(name+" "+age+" "+place);
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public void setPlace(String place){
        this.place=place;
    }
    public String getPlace(){
        return place;
    }

    public void display(){
        System.out.println("Student data :");
        System.out.println(name+" "+age+" "+place);
    }
    
}