import java.util.Scanner;
public class BirthTime
{
    public static Scanner testScan = new Scanner(System.in);
    public static void main(String[] args){
        int dayOfBirth = 0;
        int monthOfBirth = 0;
        int yearOfBirth = 0;

        yearOfBirth = SafeInput.getRangedInt(testScan, "Enter the year you were born", 1950, 2015);
        monthOfBirth = SafeInput.getRangedInt(testScan, "Enter the month you were born", 1, 12);
        dayOfBirth = SafeInput.getRangedInt(testScan, "Enter the day you were born", 1, 31);
        System.out.println("Your were born on " + monthOfBirth + " " + dayOfBirth + " " + yearOfBirth);

    }
}
