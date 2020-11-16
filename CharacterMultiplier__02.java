import java.util.Scanner;

public class CharacterMultiplier__02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String one = input[0];
        String two = input[1];
        int sum = 0;

        for (int i = 0; i < one.length(); i++) {
            char currCharOne = one.charAt(i);
            for (int j = 0; j < two.length(); j++) {
                char currCharTwo = two.charAt(j);
                int valueOne = (int) currCharOne;
                int valueTwo = (int) currCharTwo;
                int multi = valueOne * valueTwo;
                sum += multi;

                if (i == one.length() - 1) {
                    break;
                }


                currCharOne = one.charAt(i + 1);
                i++;
            }

        }

        if (one.length() < two.length()) {
            for (int k = one.length(); k < two.length(); k++) {
                char remainingSymbol = two.charAt(k);
                int remaining = (int) remainingSymbol;
                sum += remaining;

            }


        }

        if (two.length() < one.length()) {
            for (int k = two.length(); k < one.length(); k++) {
                char remainingSymbol = one.charAt(k);
                int remaining = (int) remainingSymbol;
                sum += remaining;
            }
        }

        System.out.println(sum);


    }
}
