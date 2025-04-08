public class quick_sort {

    void QS(int a[],int b,int e){
        int l=b;int r=e;int p=b;
        while(true){
            while((a[r]>=a[p]&&(p!=r))){
                r=r-1;
                if(p==r){
                    break;
                }
                if(a[r]<a[p]){
                    int t=a[r];
                    a[r]=a[p];
                    a[p]=t;
                    p=r;
                }
            }
        }
        QS(a,b,p-1);
        QS(a,p+1,e);
    }
    
}
