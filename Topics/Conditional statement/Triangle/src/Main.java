import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        if ((A + B > C) && (A + C > B) && (B + C > A)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}