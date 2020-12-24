import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask__02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> info = new LinkedHashMap<>();

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            int num = Integer.parseInt(scanner.nextLine());

            if (!info.containsKey(command)) {

                info.put(command, num);
            } else if (info.containsKey(command)) {
                info.put(command, info.get(command) + num);
            }


        }


        for (Map.Entry<String, Integer> entry : info.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
