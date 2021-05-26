import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String readURL = scanner.nextLine();
        int beginOfParam = readURL.indexOf('?');
        String parameters = readURL.substring(beginOfParam + 1, readURL.length());
        String[] urlSplit = parameters.split("=|&");
        boolean isPassFound = false;
        int passIndex = 0;
        for (int i = 0; i < urlSplit.length; i += 2){
            System.out.print(urlSplit[i] + " : ");
            if (urlSplit[i].equals("pass")){
                isPassFound = true;
                passIndex = i;
            }
            if (!urlSplit[i + 1].equals("")){
                System.out.println(urlSplit[i + 1]);
            }
            else System.out.println("not found");
        }
        if (isPassFound){
            System.out.println("password" + " : " + urlSplit[passIndex + 1]);
        }
    }
}