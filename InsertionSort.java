import java.util.Arrays;
import java.util.Scanner;

class InsertionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Length of the array :");
        int len = sc.nextInt();
        
        int []arr = new int[len];
        
        System.out.println("Elements of the array :");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        
        sc.close();
            
        insertionSort(arr);
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];

            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println("Sorted Array using Insertion sort :");
        System.out.println(Arrays.toString(arr));
    }
}