import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] inputToChar = input.toCharArray();
        boolean ordered = true;

        for (int i = 1; i < inputToChar.length; i++) {
            if (inputToChar[i] - inputToChar[i - 1] != 1) {
                ordered = false;
                break;
            }
        }
        System.out.println(ordered);

    }
}
