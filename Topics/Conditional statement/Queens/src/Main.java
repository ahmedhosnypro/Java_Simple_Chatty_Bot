import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        boolean c = x1 == x2;
        boolean r = y1 == y2;
        boolean d = Math.abs(x1 - y1) == Math.abs(x2 - y2);
        boolean d2 = ((x2 + y2) == (x1 + y1));

        if (c || r || d || d2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}