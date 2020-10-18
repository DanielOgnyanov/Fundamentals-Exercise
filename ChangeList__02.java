import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList__02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> elements = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        // 1 2 3 4 5 5 5 6
        // 20 12 4 319 21 31234 2 41 23 4

        while (!command.equals("end")){
            String [] operations = command.split("\\s+");

            if(operations[0].equals("Delete")){
                int number =Integer.parseInt(operations[1]);
                elements.removeIf(n-> n == number);


            } else  if (operations[0].equals("Insert")){
                int number = Integer.parseInt(operations[1]);
                int numberTwo = Integer.parseInt(operations[2]);

                if (numberTwo < elements.size() && number >= 0){
                    elements.add(numberTwo,number);
                }

            }
            command = scanner.nextLine();

        }
        for (Integer element : elements) {
            System.out.print(element + " ");
        }
    }
}
