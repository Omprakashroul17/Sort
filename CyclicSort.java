//so we use cyclic sort for 0-n purpose
public class CyclicSort {
    public static void main(String[]args){
        int[] arr={2,3,4,1,5};
        sort(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }
    public static void sort(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
    }
}
