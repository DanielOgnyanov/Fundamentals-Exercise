import java.util.Scanner;

public class MultiplicationTableVersion2__11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for(int i = num2; i <= 10;i++){



            sum=  i * num;

            System.out.printf("%d X %d = %d%n", num , i , sum);




        }

        if(num2>10){
            sum = num * num2;
            System.out.printf("%d X %d = %d", num , num2 , sum);

        }


    }
}
