public class inheritance {
    public static void main(String[] args) {
        Fish shark =new Fish();
        shark.eat();
        
    }
    
}
// base class
class Animal{
    String color;
    void eat(){
        System.out.println("Animal is eating");

    }
    void breathe(){
        System.out.println("animal is breathing");
    }
}

// derived class or sub class
class Fish extends Animal{
    int fins;
    void swim (){
        System.out.println("fish is swimming");
    }
}
