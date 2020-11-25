import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race__02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.asList(scanner.nextLine().split(", "));
        Map<String, Integer> reverse = new LinkedHashMap<>();
        Map<String, Integer> toPrint = new LinkedHashMap<>();
        String command = scanner.nextLine();

        while (!command.equals("end of race")) {
            String name = command.replaceAll("[^A-Za-z]+", "");
            String distanceSting = command.replaceAll("[^0-9]", "");
            int sum = 0;
            for (int i = 0; i < distanceSting.length(); i++) {
                char currentChar = distanceSting.charAt(i);
                int currentNum = Character.getNumericValue(currentChar);
                sum += currentNum;
            }

            if (input.contains(name)) {
                if (!toPrint.containsKey(name)) {
                    toPrint.put(name, 0);
                }
                toPrint.put(name, toPrint.get(name) + sum);
            } else {
                sum = 0;
            }

            command = scanner.nextLine();
        }
        toPrint.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverse.put(x.getKey(), x.getValue()));


        System.out.printf("1st place: %s\n", reverse.keySet().toArray()[0]);
        System.out.printf("2nd place: %s\n", reverse.keySet().toArray()[1]);
        System.out.printf("3rd place: %s\n", reverse.keySet().toArray()[2]);
    }
}
