import java.util.Scanner;

public class PrintAndSum__04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for(int i = start; i <= end; i++){
            sum = sum +i;
            System.out.print(i + " ");

        }
        System.out.println();

        System.out.printf("Sum: %d", sum);

    }
}
