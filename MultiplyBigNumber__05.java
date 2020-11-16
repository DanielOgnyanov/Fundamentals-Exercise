import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber__05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toConvert = scanner.nextLine();
        BigInteger firstNum = new BigInteger(toConvert);
        int secondNum = Integer.parseInt(scanner.nextLine());

        BigInteger multi = firstNum.multiply(BigInteger.valueOf(secondNum));

        System.out.println(multi);


    }
}
