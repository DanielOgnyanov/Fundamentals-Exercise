import java.util.Scanner;

public class IntegerOperations__01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int num4 = Integer.parseInt(scanner.nextLine());

        int sum = num1+num2;
        int div = sum / num3;
        int x = div * num4;

        System.out.println(x);
    }
}
