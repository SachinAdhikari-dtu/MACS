package MACS;
import java.util.*;
public class mergeSort {
    // time 0(nlogn)
    // space 0(nlogn)
public static int[] mergeSortCopy(int arr[]){
    if(arr.length==1){
        return arr;
    }
    int l[]=mergeSortCopy(Arrays.copyOfRange(arr,0,arr.length/2));
    int r[]=mergeSortCopy(Arrays.copyOfRange(arr,(arr.length/2),arr.length));
    return merger(l,r);
}

public static int[] merger(int l[],int r[]){
    int arr[]=new int[l.length+r.length];
    int i=0;
    int j =0;
    int s=0;
    while (i<l.length&&j<r.length) {
        if(l[i] > r[j]){
             arr[s++]=r[j++];
        }else{
        arr[s++]=l[i++];    
        }
        
    }

    while (i<l.length) {
        
        arr[s++]=l[i++];    
        }
        

        while (j<r.length) {
      
             arr[s++]=r[j++];
       
    }
    return arr;

}



// merge sort in place 
    // time 0(nlogn)
    // space 0(nlogn)
    public static void mergeSortInplace(int arr[],int s , int e){
        if(e-s==1)return ;
        int m=s+(e-s)/2;
       mergeSortInplace(arr, s, m);
       mergeSortInplace(arr, m, e);
       merger2(arr,s,m,e);

    }
    public static void merger2(int arr[],int s,int m ,int e){
     
        int temp[]=new int[e-s];
        int i=m;
        int k=0;
         int start = s;
        while(s<m&&i<e){
            if(arr[s] > arr[i]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[s++];
            }
        }

                while(i<e){
                temp[k++]=arr[i++];
        }

                while(s<m){
          
                temp[k++]=arr[s++];
            }
            s=start;
for (int p = 0; p < temp.length;p++) {
    arr[s + p] = temp[p];
}
}

public static void main(String[] args) {

    int arr[]={2,4,6,4,5,6,76,65,4545,0};
    System.out.println(Arrays.toString(arr));
   System.out.println(Arrays.toString( mergeSortCopy(arr)));

   
   System.out.println();
   System.out.println("MERGE SORT IN PLACE");
       int a[]={2,4,6,4,5,6,76,65,4545,9,9,9,0};
       System.out.println(Arrays.toString(a));
       mergeSortInplace(a, 0, a.length);
       System.out.println(Arrays.toString(a));

}

}
