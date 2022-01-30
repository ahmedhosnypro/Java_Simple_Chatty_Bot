// You can experiment here, it won’t be checked

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        sb1 = sb1.append("Behold the power of StringBuilder");

        StringBuilder sb2 = new StringBuilder();
        sb2.append("Behold the power of StringBuilder");

        StringBuilder sb3 = new StringBuilder()
                .append("Behold")
                .append("the power of")
                .append("StringBuilder");

        StringBuilder sb4 = new StringBuilder("Behold the power of StringBuilder");
        System.out.println(sb1.toString().equals("Behold the power of StringBuilder"));
        System.out.println(sb2.toString().equals("Behold the power of StringBuilder"));
        System.out.println(sb3.toString().equals("Behold the power of StringBuilder"));
        System.out.println(sb4.toString().equals("Behold the power of StringBuilder"));
    }
}
