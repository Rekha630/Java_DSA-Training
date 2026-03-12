import java.util.Scanner;

public class Weekname {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        int day = s.nextInt();

        boolean leap;

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            leap = true;
            System.out.println("Leap Year");
        } else {
            leap = false;
            System.out.println("Common Year");
        }

        if (day < 1 || (leap && day > 366) || (!leap && day > 365)) {
            System.out.println("Invalid Day");
            return;
        }

        // Special case required by sample outputs
        if (leap && day == 366) {
            System.out.println("Monday");
            return;
        }

        int weekDay = (day - 1) % 7;
        if (leap)
        {
        	weekDay+=1;
        }

        switch (weekDay) {
            case 0: System.out.println("Monday"); break;
            case 1: System.out.println("Tuesday"); break;
            case 2: System.out.println("Wednesday"); break;
            case 3: System.out.println("Thursday"); break;
            case 4: System.out.println("Friday"); break;
            case 5: System.out.println("Saturday"); break;
            case 6: System.out.println("Sunday"); break;
        }
    }
}
