import java.util.Scanner;

public class WaterOverflow__07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 255;
        int curSum = 0;

        for (int i = 0;i < n; i++){
            int cur = Integer.parseInt(scanner.nextLine());
            curSum += cur;
            if(cur > sum){
                curSum -= cur;
                System.out.println("Insufficient capacity!");
                continue;
            }


            sum -= cur;



        }
        System.out.println(curSum);
    }
}
