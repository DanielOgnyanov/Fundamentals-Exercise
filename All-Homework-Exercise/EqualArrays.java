import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] firstArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e-> Integer.parseInt(e)).toArray();

        int [] secondArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e-> Integer.parseInt(e)).toArray();

        // 10 20 30


        int sum = 0;
        boolean equals = true;

        for (int i = 0; i < firstArr.length ; i++) {

            for (int j = 0; j < secondArr.length ; j++) {

                equals = firstArr[i] == secondArr[j];
                if(equals){
                    sum += firstArr[i];
                }
                if(!equals){
                    System.out.printf("Arrays are not identical."+ " ");
                    System.out.printf("Found difference at %d index.",i);

                    return;
                }


                i++;
            }
        }



        System.out.printf("Arrays are identical. Sum: %d", sum);

    }
}
