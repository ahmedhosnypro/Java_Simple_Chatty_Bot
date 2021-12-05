import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[4];
        for(int i = 0; i<strings.length; i++) {
            strings[i] = scanner.next();
            System.out.println(strings[i]);
        }
    }
}