import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intA = scanner.nextInt();
        int intB = scanner.nextInt();
        int intC = scanner.nextInt();

        int sum = intA + intB + intC;

        System.out.println(sum); 
    }
}