import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction__05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e-> Integer.parseInt(e)).toArray();


        int sumOne = 0;
        int sumTwo = 0;

        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] % 2 == 0){
                sumOne += numbers[i];
            }else{
                sumTwo += numbers[i];

            }
        }
        System.out.print(sumOne-sumTwo);
    }
}
