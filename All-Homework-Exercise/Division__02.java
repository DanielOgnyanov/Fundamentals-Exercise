import java.util.Scanner;

public class Division__02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int devider = 0;


        if (num % 10 == 0) {
            devider = 10;
        } else if (num % 7 == 0) {
            devider = 7;
        } else if (num % 6 == 0) {
            devider = 6;
        } else if (num % 3 == 0) {
            devider = 3;
        } else if (num % 2 == 0) {
            devider = 2;
        }

        if (devider == 0) {
            System.out.println("Not divisible");
        } else {
            System.out.printf("The number is divisible by %d", devider);
        }




    }
}
