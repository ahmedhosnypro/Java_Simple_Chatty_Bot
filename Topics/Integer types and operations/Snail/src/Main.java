import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int pole = 0;
        int day;
        for(day = 1; day < 100; day++){
            pole += A;
            if(pole >= H)
                break;
            pole -= B;

        }
        System.out.println(day);
    }
}