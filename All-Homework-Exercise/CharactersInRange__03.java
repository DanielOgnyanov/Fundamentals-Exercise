import java.util.Scanner;

public class CharactersInRange__03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        charBetween(first,second);

    }

    public static void charBetween (char first, char second){
        for (int i = (char) first+1; i < second; i++) {


            System.out.print((char) i+" ");
        }
        for (int i = (char) second+1; i < first; i++) {
            System.out.print((char) i+" ");
        }


    }
}
