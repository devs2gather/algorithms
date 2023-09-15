import java.util.Scanner;

public class SelectionSort {
    
    // Creating a method for Selection Sort 
    public static int[] selectionSort(int[] arr) {
        
        for ( int i = 0 ; i < arr.length ; i++) {                    

            int minIndex = i;
            
            // Finding the index of minimum number in unsorted array
            for( int j = i + 1 ; j < arr.length; j++) {

                if ( arr[j] < arr[minIndex] ){                      
                    
                    minIndex = j;
                    
                }
                
            }
            
            if (minIndex != i) {

                // Swaping the minimum element with first element of unsorted array
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
                
            }
            
        }
        
        return arr;
    }

    // Creating a method to print the element of array
    public static void printArray(int[] arr) {
        
        for( int i = 0 ; i < arr.length ; i++ ) {
            
            System.out.print(arr[i]+" ");
            
        }
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length of your array: ");
        int len = sc.nextInt();

        // Creating an array
        int [] arr = new int[len];

        System.out.println("Enter the "+len+" elements: ");

        // Taking element of array as an input from user
        for ( int i = 0 ; i < arr.length ; i++ ) {
            
            arr[i] = sc.nextInt();
            
        }

        // Calling the selectionSort function
        printArray(selectionSort(arr));

    }
    
}
