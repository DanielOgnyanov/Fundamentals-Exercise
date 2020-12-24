import java.math.BigDecimal;
import java.util.Scanner;

public class PokeMon__10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int startNumberN = n / 2;


        while (n >= m) {
            if (n <= 0 || m <= 0) {
                System.out.println(0);
                System.out.println(0);

            }
            n = n - m;
            count++;

            if (n == startNumberN && n > 0 && y > 0 && y < 10) {

                n = n / y;


            }

            continue;

        }
        if (n < m) {
            System.out.println(n);
            System.out.println(count);

        }


    }
}
