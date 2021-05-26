import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean cond = true;
        int i = 0;
        for(i = num; cond;){
            i++;
            if(i % 2 == 0){
                cond = false;
            }
        }

        System.out.println(i);
    }
}
