

public class class_obj {
    public static void main(String args[]){
        Pen p1 =new Pen();
        p1.setcolor("yellow");
        p1.settip(6);
        p1.color="blue";
        System.out.println(p1.color);
        System.out.println(p1.tip);


    }
    
}

class Pen{
    String color;
    int tip;
    
    void setcolor( String newcolor){
        color = newcolor;
    }
    void settip( int newTip){
        tip = newTip;
    }
}
