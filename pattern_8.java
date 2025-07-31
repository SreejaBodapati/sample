public class pattern_8 {
    public static void main(String[] args) {
        int n = 5; // number of rows and stars
        for (int i = 1; i <= n; i++) {
            // print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

