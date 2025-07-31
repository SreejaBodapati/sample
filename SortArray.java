import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] num = {5, 2, 4, 1, 3};

        Arrays.sort(num);

        System.out.println("Sorted array: " + Arrays.toString(num));
    }
}