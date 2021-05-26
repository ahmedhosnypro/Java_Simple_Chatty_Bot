import java.util.Scanner;

class Main {
    public static void printPartitions(int target, int maxValue, String suffix) {
        if (target == 0) {
            System.out.println(suffix);
        } else {
            if (maxValue > 1) {
                printPartitions(target, maxValue - 1, suffix);
            }
            if (maxValue <= target) {
                printPartitions(target - maxValue, maxValue, suffix + " " + maxValue);
            }
        }
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printPartitions(n, n, "");
    }
}