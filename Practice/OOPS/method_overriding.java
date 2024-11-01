public class method_overriding {
    public static void main(String[] args) {
        Dog beerDog =new Dog();
        beerDog.eat();

        
    }
    
}
class Animal{
    void eat(){
        System.out.println("eathing everything");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Eating only grass");
    }
}