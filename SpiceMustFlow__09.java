import java.util.Scanner;

public class SpiceMustFlow__09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int counter = 0;


        while (true){
            if (n <=  0 || n <= 26 || n < 100){
                System.out.println(0);
                System.out.println(0);
                break;

            }
            counter++;
            int final1 = n - 26;
            sum += final1;
            n = n -10;



            if(n < 100){
                sum -= 26;

                System.out.println(counter);
                System.out.println(sum);
                break;
            }

        }

    }
}
