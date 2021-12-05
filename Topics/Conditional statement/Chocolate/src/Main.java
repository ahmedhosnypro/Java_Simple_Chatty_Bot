import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int segment = scanner.nextInt();

        if ((segment < length * width) &&
                (segment % length == 0 || segment % width == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}