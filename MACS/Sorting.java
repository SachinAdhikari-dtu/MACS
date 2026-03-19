package MACS;
//MACS DTU 
// TASK 1)

public class Sorting {

    // BUbble Sorting 

        // time complexity 0(n*n)
        // space complexity 0(1)
    public static void bubbleSorting(int arr[]){
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    // CODE TO SWAP
   public static void swap(int arr[],int i ,int j){
    int a= arr[i];
    arr[i]=arr[j];
    arr[j]=a;
   }


   // CODE TO PRINT ARRAY

   public static void print(int arr[]){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+"  ");
    }System.out.println();

   }


   // SELECTION SORT 

        // time complexity 0(n*n)
        // space complexity 0(1)
   public static void selectionSort(int arr[]){
    for (int i = 0; i < arr.length-1; i++) {
        int min=i;
        for (int j = i+1; j < arr.length; j++) {
            if(arr[min] > arr[j]){
                min=j;
            }
        }
        swap(arr, i, min);
    }
   }


   // INSERTION SORT
   public static void insertionSort(int arr[]){
    for (int i = 1; i < arr.length; i++) {
        int curr=i;
        int j=i;
        while (j>=0&&arr[j]<=arr[curr]) {
            j--;
            
        }
        j++;
        swap(arr, i, j);
    }
   }
   public static void main(String[] args) {
    int arr[]={1,6,4,2,5,434,1,26,7,45};
    print(arr);
    System.out.println("BUBBLE SORT");
    bubbleSorting(arr);
    print(arr);

    System.out.println();
    System.out.println("SELECTION SORT");
    int a[]={1,6,4,2,5,434,1,26,7,45};
    print(a);
    // selectionSort(a);
    insertionSort(a);
    print(a);


   }
    
}
