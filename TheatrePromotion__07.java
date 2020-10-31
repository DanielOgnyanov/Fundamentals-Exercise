import java.util.Scanner;

public class TheatrePromotion__07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        int age = Integer.parseInt(scanner.nextLine());

        int price = 0;

        if (age < 0){
            System.out.println("Error!");

        }

        if (age > 122){
            System.out.println("Error!");
        }

        if(0 <= age && age <= 18){
            switch (day){
                case "Weekday":
                  price = 12;
                    System.out.printf("%d$",price);
                    break;
                case "Weekend":
                    price = 15;
                    System.out.printf("%d$",price);
                    break;
                case "Holiday":
                    price = 5;
                    System.out.printf("%d$",price);
                    break;
            }

        }
        if(18 < age && age <= 64){
            switch (day){
                case "Weekday":
                    price = 18;
                    System.out.printf("%d$",price);
                    break;
                case "Weekend":
                    price = 20;
                    System.out.printf("%d$",price);
                    break;
                case "Holiday":
                    price = 12;
                    System.out.printf("%d$",price);
                    break;
            }
        }

        if(64 < age && age <= 122){
            switch (day){
                case "Weekday":
                    price = 12;
                    System.out.printf("%d$",price);
                    break;
                case "Weekend":
                    price = 15;
                    System.out.printf("%d$",price);
                    break;
                case "Holiday":
                    price = 10;
                    System.out.printf("%d$",price);
                    break;
            }
        }
    }
}
