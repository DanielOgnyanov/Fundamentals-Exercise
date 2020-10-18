import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TrainVersionTwo__01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> elements = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int max = Integer.parseInt(scanner.nextLine());


        // 32 54 21 12 4 0 23
        String command = scanner.nextLine();


        while (!command.equals("end")) {


            String[] operations = command.split("\\s+");

            if (operations[0].equals("Add")) {
                elements.add(Integer.parseInt(operations[1]));

            } else {

                int first = Integer.parseInt(operations[0]);

                for (int i = 0; i < elements.size(); i++) {
                    int sum = first + elements.get(i);
                    if (sum <= max) {
                        elements.set(i, sum);
                        break;
                    }
                }
            }



            command = scanner.nextLine();
        }

        for (Integer element : elements) {
            System.out.print(element + " ");
        }

    }
}
