import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int s1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int s2 = scanner.nextInt();

        int h = h2 - h1;
        int m = m2 + h * 60 - m1;
        int s = s2 + m * 60 - s1;
        
        System.out.println(s); 
    }
}
