import java.util.Scanner;

public class CenturiesToMinutes__09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cen = Integer.parseInt(scanner.nextLine());

        int calcYears = cen * 100;

        int calcDays = (int)(calcYears * 365.2422);


        int calcHours = calcDays * 24;

        int calcMinutes = calcHours * 60;


        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",cen,calcYears,calcDays,calcHours,calcMinutes);



    }
}
