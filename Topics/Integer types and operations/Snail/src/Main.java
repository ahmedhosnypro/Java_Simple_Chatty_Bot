import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height  = scanner.nextInt();
        int feetUp = scanner.nextInt();
        int feetDown = scanner.nextInt();

        int pole = 0;
        int day;
        for(day = 1; day < 100; day++){
            pole += feetUp;
            if(pole >= height)
                break;
            pole -= feetDown;

        }
        System.out.println(day);
    }
}