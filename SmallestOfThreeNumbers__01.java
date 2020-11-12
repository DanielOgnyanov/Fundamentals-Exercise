import java.util.Scanner;

public class SmallestOfThreeNumbers__01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        boolean finalNum = findTheSmallestNumber(first,second) < third;

        if(finalNum){
            System.out.println(findTheSmallestNumber(first,second));
        }
        if (!finalNum){
            System.out.println(third);
        }


    }

    public static int findTheSmallestNumber (int a,int b){
        if (a<b){
            return a;
        }
            return  b;

    }
}
