public class multilevel_inherit {
    
        public static void main(String[] args) {
            dog doggy =new dog();
            doggy.eat();
            doggy.breed= "jermansheferd";
            System.out.println(doggy.breed);
            
            
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
    class mamal extends Animal{
        int num;

    }

    class dog extends mamal{
        String breed;

    }
    
    

