import java.util.Scanner;

public class EvenNumber__13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        while (true){
            int num = Integer.parseInt(scanner.nextLine());

            if (num % 2 != 0){
                System.out.println("Please write an even number.");
            }

            if (num % 2 == 0){

                num = Math.abs(num);
                System.out.printf("The number is: %d", num);
                break;
            }
        }




    }
}
