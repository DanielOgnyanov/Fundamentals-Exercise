import java.util.Scanner;

public class AddAndSubtract__05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        Calculations(first,second,third);

    }

    public  static  int Calculations(int a,int b,int c){

        int sum = a+b;

        int result = sum - c;
        System.out.println(result);
        return result;

    }
}
