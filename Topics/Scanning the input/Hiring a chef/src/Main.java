//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String firstname = scanner.nextLine();
        String age = scanner.nextLine();
        String stage_of_education = scanner.nextLine();
        String years_of_experience = scanner.nextLine();
        String cuisine_preference = scanner.nextLine();

        System.out.println("The form for " +
                firstname +  " is completed. We will contact you if we need a chef that cooks " +
                cuisine_preference + " dishes.");
    }
}