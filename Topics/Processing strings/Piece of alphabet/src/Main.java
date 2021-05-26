import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] inputToChar = input.toCharArray();
        boolean ordered = true;

        for (int i = 1; i < inputToChar.length; i++){
            char tmpChar = inputToChar[i];
            if (inputToChar[i] - inputToChar[i-1] == 1);
            else ordered = false;
        }
        System.out.println(ordered);

    }
}
