public class SelectionSort {
    public static void main(String[] args) {
        int[]a={3,7,2,5,1,8,9};
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;               
                 }
        }
        if(min!=i){
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
    }
    }
    for(int e:a){
     System.out.println(e);
    }
 }
}
