public class abstract_constructor {
    
        public static void main(String[] args) {
            mustang n=new mustang();
            
            
        }
        
}
    
     abstract class Animal{
        Animal(){
            System.out.println("animal constructor is called");
        }
        void walk(){
            System.out.println("everyone is walking");
        }
        abstract void eat();
    
    }
    
    class Horse extends Animal{
        Horse(){
            System.out.println("Horse constructor is callled");
        }
        void eat() {
            System.out.println("horse is eating");
        }
    }
      
    class mustang extends Horse{
        mustang (){
            System.out.println("mustang constructor is called");
        }
        void eat(){
            System.out.println("chicken is eating");
        }
    }
    

