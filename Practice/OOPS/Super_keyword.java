public class Super_keyword {
    public static void main(String[] args) {
        horse obj =new horse();
        System.out.println(obj.color);

        
    }
    
}

class Animal {
    String color;
    Animal(){
        System.out.println("animal constructor is called");
    }
}

class horse extends Animal{
    horse(){
        super.color="brown";
        System.out.println("horse constructor is called");
    }
}
