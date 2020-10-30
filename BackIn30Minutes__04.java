import java.util.Scanner;

public class BackIn30Minutes__04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes  = Integer.parseInt(scanner.nextLine());


        int plus30 = minutes + 30;

        if (plus30 > 59){
            hours+=1;
            plus30 -= 60;
        }

        if (hours > 23){
            hours = 0;
        }

        System.out.printf("%d:%02d", hours, plus30);


    }
}
