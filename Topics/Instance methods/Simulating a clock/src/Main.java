import java.util.Scanner;

class Clock {

    int hours;
    int minutes;

    Clock (int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }

    Clock(){
        hours = 12;
        minutes = 0;
    }
    void next() {
        if (minutes == 59 && hours < 12){
            minutes = 0;
            hours++;
        }
        else if (minutes == 59 && hours == 12){
            minutes = 0;
            hours = 1;
        }
        else {
            minutes++;
        }
    }
}

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();

        Clock clock = new Clock(hours, minutes);
        clock.next();
        System.out.println(clock.hours + ":" + clock.minutes);
    }
}