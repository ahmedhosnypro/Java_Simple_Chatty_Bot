import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intA = scanner.nextInt();
        int intB = scanner.nextInt();
        int intC = scanner.nextInt();

        System.out.println((intA + intB == 20) || (intA + intC == 20) || (intB + intC == 20));
    }
}