import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();

        if (n1 < 1 ){
            System.out.println("no army");
        }
        else if (n1 <= 19){
            System.out.println("pack");
        }
        else if (n1 <= 249){
            System.out.println("throng");
        }
        else if (n1 <= 999){
            System.out.println("zounds");
        }
        else {
            System.out.println("legion");
        }
    }
}
