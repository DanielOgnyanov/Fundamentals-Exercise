import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CaesarCipher__04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textToShift = scanner.nextLine();

        List<Character> toPrint = new ArrayList<>();

        for (int i = 0; i < textToShift.length() ; i++) {
            char charToChange = textToShift.charAt(i);

            int modified = (int) charToChange+3;

            char toSave = (char)modified;

            toPrint.add(toSave);

        }

        for (int i = 0; i < toPrint.size() ; i++) {
            System.out.print(toPrint.get(i));
        }
    }
}
