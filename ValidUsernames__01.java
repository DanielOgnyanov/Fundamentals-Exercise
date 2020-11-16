import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidUsernames__01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        List<String> validUser = new ArrayList<>();

        for (int i = 0; i < input.length ; i++) {
              String curr = input[i];
            if(curr.length() > 3 && curr.length() < 16 && curr.matches("[a-zA-Z0-9\\-_]+")){
                validUser.add(input[i]);


            }
        }

        for (String s : validUser) {
            System.out.println(s);
        }
    }
}
