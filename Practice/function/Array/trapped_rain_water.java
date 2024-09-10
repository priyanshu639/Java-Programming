public class trapped_rain_water {
    public static int traped_water(int Height[]){
        // calculate left max
        int n=Height.length;
        int leftmax[]= new int[n];
        leftmax[0]=Height[0];
        for (int i=1;i<n;i++){
            leftmax[i]=Math.max(Height[i],leftmax[i-1]);
        }
        int rightmax[]=new int[n];
        rightmax[n-1]=Height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(Height[i], rightmax[i+1]);
        }
        int trapedwater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trapedwater+=waterlevel-Height[i];
        }
        return trapedwater ;
    }
    public static void main(String[] args) {
        int Height[]={4,2,0,6,3,2,5};
        int n=Height.length;
        System.out.println(traped_water(Height));
    }
    
}
