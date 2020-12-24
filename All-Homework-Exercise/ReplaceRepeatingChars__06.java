import java.util.*;

public class ReplaceRepeatingChars__06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        List<Character> toPrint = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);
            if (i == input.length() - 1) {
                break;
            }
            char currTwo = input.charAt(i + 1);

            if (!toPrint.contains(curr)) {
                toPrint.add(curr);
            }

            if (curr != currTwo) {
                toPrint.add(currTwo);
            }
        }

        for (int i = 0; i < toPrint.size(); i++) {
            System.out.print(toPrint.get(i));
        }

    }
}
