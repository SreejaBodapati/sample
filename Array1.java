public class Array1 {
    public static void main(String[] args) {
        // 1D array
        int[] arr1D = {1, 2, 3, 4, 5};

        // 2D array
        int[][] arr2D = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Accessing 1D array element
        int val1D = arr1D[2];

        // Accessing 2D array element
        int val2D = arr2D[1][0];
        
        System.out.println("val1D: " + val1D);
        System.out.println("val2D: " + val2D);
    }
}
