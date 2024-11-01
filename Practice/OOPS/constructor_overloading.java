public class constructor_overloading {
    public static void main(String[] args) {
        student obj=new student();
        student obj2=new student("yash");
        student obj3=new student(34);
        
    }
    
}

class student{
    String name;
    int age;

    student(){
        System.out.println("this is non parametrized constructor");
    }
    student(String name){
        this .name=name;
        // System.out.println("this is paramitirized constructor");
        
    }

    student(int age){
        this.age=age;
        // System.out.println("this is paramitirized constructor");
    }
}