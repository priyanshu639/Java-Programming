public class exception {
    public static void validate (int age){
        if (age<18){
            throw new ArithmeticException("Person is not elligible ") ;
        }
    }
    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of the code ..");
    }
    
} 