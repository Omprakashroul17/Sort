public class MergeSort {

    public static void main(String[] args) {
        int[]a={4,2,8,6,9,8,3};
        sort(a);
        for(int e:a){
            System.out.println(e);
        }
    }
    public static void sort(int[]a){
        if(a.length==1)return;
       int[]left=new int[a.length/2];
       int[]right=new int[a.length-left.length];
       int k=0;
       for(int i=0;i<left.length;i++){
        left[i]=a[k];
        k++;
       }
       for(int j=0;j<right.length;j++){
        right[j]=a[k];
        k++;
       }
       sort(left);
       sort(right);
       merge(left,right,a);
    }
    public static void merge(int[]left,int[]right,int[]a) {
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length ){
            if(left[i]<right[j]){
                a[k++]=left[i++];
            }
            else{
                a[k++]=right[j++];
            }
        }
        while(i<left.length){
            a[k++]=left[i++];
        }
        while(j<right.length){
            a[k++]=right[j++];
        }
        
    }
}