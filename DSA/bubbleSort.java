public class bubbleSort {

    static void sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){       //outer loop
          //optimal approach
          boolean flag= false;  // ha any swapped happened
          
           
                                         
            for(int j=0;j<n-i-1;j++){         // inner loop 
                                  
                if(arr[j]>arr[j+1]){      
                int temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1]= temp;
             flag = true;            

                }
            }
             if(flag == false)      
               return;
                
        }
    }
 

    public static void main(String[] args) {
      int[] nums= {4,9,3,7,6};
      sort(nums);
      for(int arr: nums){
        System.out.print(arr+" ");
      }
    }
}
