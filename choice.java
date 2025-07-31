import java.util.Scanner;
public class choice {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your operation: 1. Add 2. sub 3.div 4.mul:");
        int choice = sc.nextInt();

        System.out.println("enter a number num1");
        int num1 = sc.nextInt();

        System.out.println("enter a number num2");
        int num2 = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("the add of 2 numbers is:"+(num1+num2));
                break;
            case 2:
                System.out.println("the sub of 2 numbers is:"+(num1-num2));
                break;
            case 3:
                System.out.println("the mul of 2 numbers is:"+(num1*num2));
                break;
            case 4:
                System.out.println("the div of 2 numbers is:"+(num1/num2));
                break;
            default:
                System.out.println("choice not found");
        }
        sc.close();
    }
}


