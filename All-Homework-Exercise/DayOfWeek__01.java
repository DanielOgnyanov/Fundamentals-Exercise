import java.util.Arrays;
import java.util.Scanner;

public class DayOfWeek__01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] day = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        boolean a = true;
        if (n > 7 || n <= 0) {
            System.out.println("Invalid day!");
            return;
        }

        for (int i = 0; i < day.length; i++) {

            a = n - 1 == i;
            if (a) {
                System.out.println(day[i]);
            }

        }


    }
}
