import java.util.*;

public class CountCharsInAString__01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();


        Map<Character, Integer> charFreq = new LinkedHashMap<Character, Integer>(); // check

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);


            if (!charFreq.containsKey(character) && character != ' ') {

                charFreq.put(character, 1);

            } else if (charFreq.containsKey(character)) {
                charFreq.put(character, charFreq.get(character) + 1);
            }


        }


        for (Map.Entry<Character, Integer> cha : charFreq.entrySet()) {


            System.out.printf("%c -> %d\n", cha.getKey(), cha.getValue());
        }

    }


}

