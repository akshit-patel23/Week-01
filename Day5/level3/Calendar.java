import java.util.Scanner;

public class Calendar {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        
        // For February, check if it's a leap year
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;  // Leap year
            }
        }
        return daysInMonth[month - 1];
    }

    // Method to get the first day of the month using Gregorian calendar formula
    public static int getFirstDayOfMonth(int month, int year) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDayOfMonth = getFirstDayOfMonth(month, year);

        // Print the calendar header
        System.out.println(monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print the first indentation to align the first day properly
        for (int i = 0; i < firstDayOfMonth; i++) {
            System.out.print("    ");  // Four spaces for alignment
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            // Print the day with proper indentation for single digits
            System.out.printf("%3d ", day);

            // Move to the next line after Saturday
            if ((firstDayOfMonth + day) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();  // Move to the next line after printing all days
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the month and year
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Display the calendar for the given month and year
        displayCalendar(month, year);

        scanner.close();
    }
}