public class abstaction_class {
    public static void main(String[] args) {
        Horse a=new Horse();
        a.eat();
        a.walk();

        chicken b=new chicken();
        b.eat();
        b.walk();
        
    }
    
}

 abstract class Animal{
    void walk(){
        System.out.println("everyone is walking");
    }
    abstract void eat();

}

class Horse extends Animal{
    void eat() {
        System.out.println("horse is eating");
    }
}
  
class chicken extends Animal{
    void eat(){
        System.out.println("chicken is eating");
    }
}