import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        char[] chNums = str.toCharArray();
        int fst3Sum = 0;
        int lst3Sum = 0;
        for(int i = 0; i < 6; i++){
            if (i < 3){
                fst3Sum += chNums[i];
            }
            else lst3Sum += chNums[i];
        }
        if (fst3Sum == lst3Sum)
            System.out.println("Lucky");
        else System.out.println("Regular");
    }
}