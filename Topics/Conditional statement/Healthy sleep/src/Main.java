import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (C < A){
            System.out.println("Deficiency");
        }
        else if (C > B){
            System.out.println("Excess");
        }
        else if (C >= A || C <= B){
            System.out.println("Normal");
        }
    }
}