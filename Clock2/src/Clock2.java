import java.util.Scanner;

public class Clock2 {
    public static void main(String[] args) {

         System.out.println("Текущее время в формате ЧЧ:ММ:CC ");

        String current_time = new Scanner(System.in).nextLine();
        Scanner sc = new Scanner(current_time).useDelimiter(":");

        int hh = sc.nextInt();
        int mm = sc.nextInt();
        int ss = sc.nextInt();
        int total_seconds = ss + mm * 60 + hh * 3600;

        System.out.println("Всего секунд от начала дня: " + total_seconds);
    }
}
