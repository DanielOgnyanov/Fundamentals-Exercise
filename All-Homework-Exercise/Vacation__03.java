import java.util.Scanner;

public class Vacation__03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day  = scanner.nextLine();

        double totalPrice = 0;

        if ("Students".equals(typeOfGroup)) {
            if ("Friday".equals(day)) {
                totalPrice = people * 8.45;
            } else if ("Saturday".equals(day)) {
                totalPrice = people * 9.80;
            } else if ("Sunday".equals(day)) {
                totalPrice = people * 10.46;
            }
            if (people >= 30) {
                totalPrice *= 0.85;
            }
        } else if ("Business".equals(typeOfGroup)) {
            if (people >= 100) {
                people = people - 10;
            }
            if ("Friday".equals(day)) {
                totalPrice = people * 10.90;
            } else if ("Saturday".equals(day)) {
                totalPrice = people * 15.60;
            } else if ("Sunday".equals(day)) {
                totalPrice = people * 16;
            }
        } else if ("Regular".equals(typeOfGroup)) {
            if ("Friday".equals(day)) {
                totalPrice = people * 15;
            } else if ("Saturday".equals(day)) {
                totalPrice = people * 20;
            } else if ("Sunday".equals(day)) {
                totalPrice = people * 22.50;
            }
            if (people >= 10 && people <= 20) {

                totalPrice *= 0.95;

            }
        }
        System.out.printf("Total price: %.2f", totalPrice);

    }
}

