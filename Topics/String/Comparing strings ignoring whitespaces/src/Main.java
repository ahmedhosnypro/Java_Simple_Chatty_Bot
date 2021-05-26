import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        String s1 = input1.replaceAll(" ", "");
        String s2 = input2.replaceAll(" ", "");
        boolean b = s1.equals(s2);
        System.out.println(b);
    }
}