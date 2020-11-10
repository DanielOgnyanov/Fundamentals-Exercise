import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers__03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e-> Integer.parseInt(e)).toArray();

           // 1 2 3 4 5 6
        int sum = 0;

        for (int i = 0 ; i < numbers.length; i++) {
             if (numbers[i] % 2 == 0){
                 sum += numbers[i];
             }

        }
        System.out.print(sum);
    }
}
