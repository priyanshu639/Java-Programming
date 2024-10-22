public class Acces_modifier{
    public static void main(String[] args) {
        Bankaccount obj=new Bankaccount();
        obj.username="himani";
        // obj.password=1234;
        System.out.println(obj.username);
        // System.out.println(obj.password);  
        obj.stPswrd(12334);      
    }
}

class Bankaccount{
    public String username;
    private int password;
    public void stPswrd( int pswd){
        password=pswd;
        System.out.println(password);
    }
    


}