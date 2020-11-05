import java.util.Scanner;

public class ConvertMetersToKilometers__01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double met = Integer.parseInt(scanner.nextLine());

        double convert = met / 1000;

        System.out.printf("%.2f", convert);

    }
}
