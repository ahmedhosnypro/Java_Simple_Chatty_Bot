import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int RPBCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        if (isWeekend) {
            System.out.println(RPBCups >= 15 && RPBCups <= 25);
        } else {
            System.out.println(RPBCups >= 10 && RPBCups <= 20);
        }
    }
}