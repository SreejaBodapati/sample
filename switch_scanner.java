import java.util.Scanner;
public class switch_scanner {
    public static void main(String[] args) {
        System.out.println("enter the number of days:");
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        switch(days){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("sunday");
            break;
            default:
            System.out.println("day not found");
        }
        sc.close();
    }
}