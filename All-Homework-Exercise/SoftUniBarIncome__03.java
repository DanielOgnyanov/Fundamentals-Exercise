import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome__03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("^%(?<name>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.*[0-9]*)\\$$");
        double sum = 0;

        while (!input.equals("end of shift")) {


            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                double count = Double.parseDouble(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                System.out.printf("%s: %s - %.2f\n", matcher.group("name"), matcher.group("product"), count * price);
                sum += count * price;
            }

            input = scanner.nextLine();
        }


        System.out.printf("Total income: %.2f", sum);


    }
}
