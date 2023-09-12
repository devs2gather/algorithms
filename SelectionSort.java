import java.util.Scanner;
public class SelectionSort{
    public static int[] selectionSort(int[] arr){
        
        for (int i=0;i<arr.length;i++){                    

            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){

                if (arr[j] < arr[minIndex]){                      
                    
                    minIndex = j;                     //here we are finding the index of minimun element
                }
            }
            if (minIndex != i){
                
                // Here we are swaping the minimum element with the first element of unsorted array
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length of your array: ");
        int len = sc.nextInt();

        int [] arr = new int[len];

        System.out.println("Enter the "+len+" elements: ");

        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        //Calling the selectionSort function
        printArray(selectionSort(arr));




    }
}