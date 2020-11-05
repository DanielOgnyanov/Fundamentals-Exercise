import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers__03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);

        for(double i = 0 ; i < n; i++){
           String currentNumber = scanner.nextLine();
            BigDecimal num = new BigDecimal(currentNumber);

            sum = sum.add(num);



        }
        System.out.println(sum);

    }
}
