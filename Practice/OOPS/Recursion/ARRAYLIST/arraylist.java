
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2,11);
        System.out.println(list);

        // get operations
        System.out.println(list.get(4));

        // delete operations
        list.remove(2);
        System.out.println(list);

        // set element at index

        list.set(2,44);
        System.out.println(list);

        // contains element -->means that element exist in the araylist or not

        System.out.println(list.contains(44));
        





    }
    
}
