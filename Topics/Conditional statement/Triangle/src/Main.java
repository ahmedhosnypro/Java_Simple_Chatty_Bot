import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sideA = scanner.nextDouble();
        double sideB = scanner.nextDouble();
        double siedC = scanner.nextDouble();

        if ((sideA + sideB > siedC) && (sideA + siedC > sideB) && (sideB + siedC > sideA)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}