import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.endsWith("0")){
            System.out.println(new StringBuilder(input.substring(0, input.length()-1)).reverse());
        }else{
            System.out.println(new StringBuilder(input).reverse());
        }
    }
}
