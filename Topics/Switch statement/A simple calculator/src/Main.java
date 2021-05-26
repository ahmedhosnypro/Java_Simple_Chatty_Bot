import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        Long fstNumber = scanner.nextLong();
        char operation = scanner.next().charAt(0);
        Long sndNumber = scanner.nextLong();

        switch (operation){
            case '+':
                Long result = fstNumber + sndNumber;
                System.out.println(result);
                break;
            case '-':
                result = fstNumber - sndNumber;
                System.out.println(result);
                break;
            case '*':
                result = fstNumber * sndNumber;
                System.out.println(result);
                break;
            case '/':
                if (sndNumber != 0) {
                    result = fstNumber / sndNumber;
                    System.out.println(result);
                }
                else System.out.println("Division by 0!");
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}