import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int intA = scanner.nextInt();
        if (intA % 10 != 0) {
            System.out.print(intA % 10);
        } else System.out.print("");
        System.out.print((intA % 100) / 10);
        System.out.print(intA / 100);
    }
}