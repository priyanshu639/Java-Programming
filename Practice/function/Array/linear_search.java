
public class linear_search {
    public static int linearSearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int number[]={2,4,5,6,8,9,32,54,44};
        int key=54;
        int index =linearSearch(number,key);
        if(index==-1){
            System.out.println("index not found");
        
        }
        else{
            System.err.println("index found :" + index);
            
        }
    }
    
}
