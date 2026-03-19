package MACS;
import java.util.*;
public class Non__Comparing {
   
    // when arr size is small
    // time complexity 0(n)
    // space complexity 0(n)
     public static void countingSort(int arr[]){
        //find max no 
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            max=Math.max(max,arr[i]);
        }

        int ans[]=new int[max];
        int s=0;
        while(s<arr.length){
            ans[arr[s++]-1]++;
        }
        s=0;
        int c=0;
        while(s<ans.length){
            if(ans[s]!=0){
                arr[c++]=s+1;
                ans[s]--;
            }else{
                s++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={3,5,6,4,1,4,7,8,9};
        System.out.println();
        System.out.println("COUNT SORT ");
        System.out.println(Arrays.toString(arr));
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
        

        int a[]={3,5,6,4,1,4,7,8,9};
        System.out.println();
        System.out.println("RADIX SORT");
    }
    
}
