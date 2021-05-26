import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int sequence = scanner.nextInt();
        int  N = scanner.nextInt();
        int result = 0;
        if (N % 4 == 0){
            result = N;
        }
        for (int i = 0; i < sequence -1; i++){
            int n1 = scanner.nextInt();
            if (n1 % 4 == 0 && n1 > result){
                result = n1;
            }
            N = n1;
        }
        System.out.println(result);
    }
}