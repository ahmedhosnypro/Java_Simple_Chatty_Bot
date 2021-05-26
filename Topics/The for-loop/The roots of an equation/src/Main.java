import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c= scanner.nextInt();
        int d = scanner.nextInt();

        StringBuilder str = new StringBuilder("");

        for (int i = 0; i<= 1000; i++){
            int cubic = i * i * i;
            int square = i * i;
            boolean bool = (a * cubic + b * square + c * i + d) == 0;

            if (bool){
                str.append(i);
            }
        }

        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
}