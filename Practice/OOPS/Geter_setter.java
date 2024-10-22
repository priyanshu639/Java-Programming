

public class Geter_setter {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setUsername("wqwdfv");
        System.out.println(p1.getUsername());
        p1.setPasswrd(123456);
        System.out.println(p1.getPasswrd());
        
    }
    
}
class Pen {
    private String username;
    private int passwrd;

    public String getUsername() {
        return this.username;
    }
    public int getPasswrd() {
        return this.passwrd;
    }
   
    public void setUsername(String username) {
        this.username = username;
    }
    
    
    public void setPasswrd(int passwrd) {
        this.passwrd = passwrd;
    }
   
}
