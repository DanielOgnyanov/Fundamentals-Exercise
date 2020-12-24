import java.util.Scanner;

public class SumOfOddNumbers__09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int sum = 0;

        for(int i = 1; i <= 100; i += 2){
            System.out.println(i);

            count++;
            sum +=i;


            if(count == num){

                System.out.printf("Sum: %d", sum);
                break;
            }












        }
    }
}
