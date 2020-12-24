import java.util.Scanner;

public class Train__01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        int trans = Integer.parseInt(n);

        int[] arr = new int [trans];

        int sum = 0;

        for (int i = 0; i < trans;i++ ){
            arr [i] = Integer.parseInt(scanner.nextLine());
            int num = arr [i];
            sum += num;

        }

        for (int i = 0;i < trans;i++ ){
            System.out.print(arr [i] + " ");

        }
        System.out.println();
        System.out.println(sum);





    }
}
