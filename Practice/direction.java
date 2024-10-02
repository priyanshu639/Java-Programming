public class direction {
    public static float print_the_PATH_direction(String path){
        int X=0, Y=0;
        for(int i=0;i<path.length();i++){
            char dirctn= path.charAt(i);

        
        // north
        if(dirctn=='N'){
            Y++;

        }
        // south
        else if(dirctn=='S'){
            Y--;
        }
        // east
        else if(dirctn=='E'){
            X--;

        }
        // west
        else{
            X++;
        }
        
        
    }
    int X2=X*X;
    int Y2=Y*Y;
    return (float)Math.sqrt(X2+Y2);
}
    public static void main(String[] args) {
        String path= "WNEENESENNN";
        System.out.println(print_the_PATH_direction(path));
    }
    
}
