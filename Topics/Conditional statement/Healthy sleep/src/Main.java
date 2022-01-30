import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hoursPerDay = scanner.nextInt();
        int notMoreThanB = scanner.nextInt();
        int sleeps = scanner.nextInt();

        if (sleeps < hoursPerDay) {
            System.out.println("Deficiency");
        } else if (sleeps > notMoreThanB) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}