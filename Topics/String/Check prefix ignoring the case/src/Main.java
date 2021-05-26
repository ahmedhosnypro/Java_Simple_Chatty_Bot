import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = s.toLowerCase();
        boolean b = s1.startsWith("j");
        System.out.println(b);
    }
}