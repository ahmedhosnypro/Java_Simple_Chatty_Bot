import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intA = scanner.nextInt();
        int intB = scanner.nextInt();
        int intC = scanner.nextInt();

        boolean b1 = intA > 0 && intB <= 0 && intC <= 0;
        boolean b2 = intB > 0 && intA <= 0 && intC <= 0;
        boolean b3 = intC > 0 && intB <= 0 && intA <= 0;
        System.out.println(b1 || b2 || b3);
    }
}