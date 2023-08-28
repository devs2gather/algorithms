 //Code for Sorting An Array By Shivam Kumar Singh
import java.util.Scanner;

class BubbleSort {



   static void bubbleSort(int[] arr) {                           //Function For Bubble sort
        int n = arr.length;

        for(int i = 0; i < n - 1; ++i) {                        // Traversing on array
            for(int j = 0; j < n - i - 1; ++j) {               //
                if (arr[j] > arr[j + 1]) {                    // Checking condition 
                    int temp = arr[j];                       //
                    arr[j] = arr[j + 1];                    // swaping element
                    arr[j + 1] = temp;                     //
                }
            }
        }

    }
   static void printArray(int[] arr) {                   // Print array Function
        int n = arr.length;

        for(int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
                                                          //Creating array by user input
            System.out.println("Enter Array length");
            int n= sc.nextInt();
            int [ ] arr = new int[n];
            System.out.println("Enter "+n+ " element");
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();}
    
        System.out.println("unsorted array");          // Printing unsorted array
         printArray(arr);                               // Calling print array Function
        bubbleSort(arr);                                // Calling sorting function
        System.out.println("Sorted array");           // Printing Sorted array
        printArray(arr);
    
    }
}

