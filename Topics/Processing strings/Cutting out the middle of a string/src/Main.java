import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder(scanner.nextLine());
        int middle = str.length() / 2;
        if (str.length() % 2 != 0) {
            str = str.deleteCharAt(middle);
        } else str = str.delete(middle - 1, middle + 1);
        System.out.println(str);
    }
}