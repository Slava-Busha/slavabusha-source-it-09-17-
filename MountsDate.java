import java.util.Scanner;

public class MountsDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number month ");
        int count = scanner.nextInt();
        checkMonth(count);
        getMonth(count);
        scanner.close();
    }
    private static void checkMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("month from 1 to 12");
        }
    }
    private static void getMonth(int count) {
        String[] month = new String[12];
        month[1] = "January";
        month[2] = "February";
        month[3] = "March";
        month[4] = "April";
        month[5] = "May";
        month[6] = "June";
        month[7] = "July";
        month[8] = "August";
        month[9] = "September";
        month[10] = "October";
        month[11] = "November";
        month[12] = "December";

        System.out.println("Month: " + month[count]);
    }
}


