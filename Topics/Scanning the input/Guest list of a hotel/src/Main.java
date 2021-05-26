//put imports you need here

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        while (scanner.hasNext()){
            sb.append(scanner.next()).append(" ");
        }
        String[] sArray = sb.toString().split(" ");
        for (int i = sArray.length - 1; i >= 0; i--){
            System.out.println(sArray[i]);
        }
    }
}