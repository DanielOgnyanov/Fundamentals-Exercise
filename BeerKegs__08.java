import java.util.Scanner;

public class BeerKegs__08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int n = Integer.parseInt(scanner.nextLine());
        double max = Double.MIN_VALUE;
        String model = "";

        for (int i = 0; i < n; i++){
            String model1 = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());

            double calc = Math.PI * (radius * radius) * height;

            if(max < calc){
                max = calc;
                model = model1;
            }




        }


        System.out.println(model);
    }
}
