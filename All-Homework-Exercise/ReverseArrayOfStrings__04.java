import java.util.Scanner;

public class ReverseArrayOfStrings__04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] elements = scanner.nextLine().split(" ");

        // -1 hi ho w

        for (int i = elements.length-1; i >= 0 ; i--) {
            System.out.print(elements[i] + " ");
        }

    }
}
