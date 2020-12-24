import java.io.IOException;
import java.util.Scanner;

public class SumOfChars__04 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1 ;i<=n; i++){
            char c = (char) scanner.next().charAt(0);
            int asc = (int ) (c);

             sum += asc;


        }
        System.out.printf("The sum equals: %d", sum);
    }
}
