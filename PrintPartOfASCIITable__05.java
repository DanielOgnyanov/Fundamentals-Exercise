import java.util.Scanner;

public class PrintPartOfASCIITable__05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int f = Integer.parseInt(scanner.nextLine());


        for (int i = n ;i <= f; i++){


            System.out.print((char)i+" ");


        }

    }
}
