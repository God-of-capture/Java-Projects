import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Date now = new Date(); //current time, date.
        // Add 1 day = 24 * 60 * 60 * 1000 milliseconds
        //"new Date(now.getTime()" = For getting today's time the simply adding 1 day.
        Date tomorrow = new Date(now.getTime() + (24L * 60 * 60 * 1000));
        System.out.println("now=" +now);
        System.out.println("tomorrow=" +tomorrow);
    }
}