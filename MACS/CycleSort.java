package MACS;
import java.util.*;

// when no are given in range form 1 to n 
// n= arr.length
//   time complexity 0(n)
//  space complexity  0(1)
public class CycleSort {

   public static void cycleSort(int arr[]){
    int s=0;
    while (s<arr.length) {
        int c=arr[s]-1;
        if(arr[c]!=arr[s]){
            int a= arr[s];
            arr[s]=arr[c];
            arr[c]=a;
        }else{
            s++;
        }
    }
   }


    public static void main(String[] args) {
        int arr[]={1,9,5,8,7,6,4,3,2};
        System.out.println(Arrays.toString(arr));
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    
}
