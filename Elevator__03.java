import java.util.Scanner;

public class Elevator__03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        double people = Double.parseDouble(scanner.nextLine());

        double calc = Math.ceil(n / people);
         if(n<people){
             System.out.println(1);

         }else {
             System.out.printf("%.0f",calc);
         }


    }
}
