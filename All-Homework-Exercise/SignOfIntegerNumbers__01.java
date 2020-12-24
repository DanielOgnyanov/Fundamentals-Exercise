import java.util.Scanner;

public class SignOfIntegerNumbers__01 {
    public static void main(String[] args) {

      numbersFinder();

    }
    private static int numbersFinder (){
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());


        if (input > 0){
            System.out.printf("The number %d is positive.",input);

        } else if (input < 0){
            System.out.printf("The number %d is negative.",input);

        }else if (input == 0){
            System.out.printf("The number %d is zero.",input);

        }
        return input;

    }

}
