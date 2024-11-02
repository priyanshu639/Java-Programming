public class iterface_multi_inherit {
    public static void main(String[] args) {
        beer obj=new beer();
        obj.cow();
        obj.dog();
    }
    
}

interface herbivores{
    void cow();

}

interface carnivores{
    void dog();

}
 
class beer implements herbivores,carnivores{
    public void cow(){
        System.out.println("cow eat grass only");
    }
    public void dog(){
        System.out.println("dog eats meat");
    }

}