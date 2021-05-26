import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        if (n % 10 != 0){
            System.out.print(n % 10);
        }
        else System.out.print("");
        System.out.print((n % 100) / 10);
        System.out.print(n / 100);
    }
}