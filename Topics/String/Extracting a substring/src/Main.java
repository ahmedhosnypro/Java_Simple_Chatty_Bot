import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        n2++;
        String s1 = s.substring(n1, n2);
        System.out.println(s1);
    }
}