import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int units = scanner.nextInt();

        if (units < 1) {
            System.out.println("no army");
        } else if (units <= 19) {
            System.out.println("pack");
        } else if (units <= 249) {
            System.out.println("throng");
        } else if (units <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}
