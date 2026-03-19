public class BinarySearch {

    //BINARY SEARCH 
    // TIME COMPLEXITY 0(LOGN)
    public static int BinarySearch1(int arr[],int key){
        int s=0;
        int e= arr.length-1;
        
        while(s<=e){
            
            int m = s +(e-s)/2;
            if(arr[m]==key)return m;
            if(arr[m] > key){
                e=m-1;
            }else{
                s=m+1;
            }
            
        }return -1;
    }


    // BINARY SEARCH USING RECURSION 
      // TIME COMPLEXITY 0(LOGN)
    public static int BinarySearch2(int arr[],int key , int s , int e){
        if(s>e)return -1;
        
        int m=s +(e-s)/2;
        if(arr[m]==key)return m;
            if(arr[m] > key){
                e=m-1;
            }else{
                s=m+1;
            }
        
    return BinarySearch2(arr,key,s,e);
        }



        public static void main(String[] args) {
            int arr[]={1,2,3,4,5,6,7,8,9};
            System.out.println(BinarySearch1(arr,5));
            

            System.out.println(BinarySearch2(arr, 5, 0, arr.length-1));
        }
}
