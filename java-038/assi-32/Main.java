
// Develop a java program that utilizes standard java API packages to manage date and time operatiions.The program shuld display the current date and time,Identify the day of the week,and calculate the number of days between two user-specified dates.The design should emphasize effective usage of built-in API classes rather than manual calculations,reniforcing the importance of libary-based development.


import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Current date/time and day of week
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current: " + now);
        System.out.println("Day of week: " + now.getDayOfWeek());

        // User input dates
        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate d1 = LocalDate.parse(sc.nextLine());
        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate d2 = LocalDate.parse(sc.nextLine());

        // Days between
        long days = ChronoUnit.DAYS.between(d1, d2);
        System.out.println("Days between: " + Math.abs(days));

        sc.close();
    }
}

