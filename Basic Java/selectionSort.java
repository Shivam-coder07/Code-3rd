public class selectionSort {

     static void sorting(int[] arr){
       int n=arr.length;
       for(int i=0;i<n-1;i++){
        int min_index=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]< arr[min_index]){
                min_index= j;
            }
        }
       
        if(arr[min_index]!=i){
        int temp = arr[i];
        arr[i]= arr[min_index];
        arr[min_index]= temp;
        }
        else{
            min_index=arr [i];
        }

        
       } 
     }
    

   public static void main(String[] args) {
    int[] arr={1,65,9,7,96,47};
    sorting(arr);
    for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
    }
   }
}
