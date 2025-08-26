public class arrayGreatesVal {
    public static void main(String[] args){
        int[] arr={5,9,47,56};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        System.out.println(ans);
   }
}
