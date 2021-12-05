import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p = scanner.nextDouble();
        double h = scanner.nextDouble();
        double g = 9.8;
        double P = p*g*h;
        System.out.println(P);
    }
}