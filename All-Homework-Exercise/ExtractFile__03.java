import java.util.Scanner;

public class ExtractFile__03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] file = scanner.nextLine().split("\\\\");
        String last = file[file.length-1];

        String[] split = last.split("\\.");


        System.out.printf("File name: %s\n",split[0]);
        System.out.printf("File extension: %s",split[1]);

    }
}
