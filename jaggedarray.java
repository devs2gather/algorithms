public class JaggedArrayExample {  
    public static void main(String[] args) {  
          
        // create a jagged array with three rows  
        int[][] jaggedArray = {  
            {1, 2, 3},   // first row has three columns  
            {4, 5},      // second row has two columns  
            {6, 7, 8, 9} // third row has four columns  
        };  
          
        // loop through each row of the jagged array  
        for (int i = 0; i < jaggedArray.length; i++) {  
              
            // loop through each column of the current row  
            for (int j = 0; j < jaggedArray[i].length; j++) {  
                  
                // print the value at the current position in the array  
                System.out.print(jaggedArray[i][j] + " ");  
            }  
              
            // move to the next line for the next row  
            System.out.println();  
        }  
    }  
}  
