import java.util.ArrayList;

public class mult_Dim {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();

        for(int  i=1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);

        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);


        // nested loops

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer>cuurlist=mainList.get(i);
            for(int j=0;j<cuurlist.size();j++){
                System.out.print(cuurlist.get(j)+" ");
            }
            System.out.println();
        }
    }

    
}
