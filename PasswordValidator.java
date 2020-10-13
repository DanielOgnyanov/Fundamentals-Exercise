import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        correctLogin(input);


    }
    public static void correctLogin(String input){
        boolean check = false;
        if (input.length() >= 6 && input.length() <= 10) {
            check = true;
        } else {
            check = false;
            System.out.println("Password must be between 6 and 10 characters");


        }


        boolean letters = true;

        for (int i = 0; i < input.length() ; i++) {
            String extract = input.replaceAll("[^a-zA-Z^0-9].*", "");
            if(!input.equals(extract)){
                letters = false;

            }
        }
        if(!letters){
            System.out.println("Password must consist only of letters and digits");

        }

        boolean symbol = true;
        String onlyNum = input.replaceAll("[^0-9]", "");
        int count = 0;
        for (int i = 0; i < onlyNum.length(); i++) {
            count++;
        }
        symbol = count >= 2;
        if(!symbol){
            System.out.println("Password must have at least 2 digits");


        }

        if(check && letters && symbol){
            System.out.println("Password is valid");
        }







    }


}
