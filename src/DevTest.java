import java.util.Scanner;

public class DevTest {
    public static Scanner testScan = new Scanner(System.in);

    public static void main(String[] args) {
        String firstName = "";
        int age = 0;
        double salary = 0;
        int favNum = 0;
        boolean yesOrNo = false;
        int dayOfBirth = 0;
        int monthOfBirth = 0;
        int yearOfBirth = 0;
        double itemPrice = 0;


        SafeInput.PrettyHeader(testScan, "Enter your message");

       /* firstName = SafeInput.getNonZeroLenString(testScan, "Enter your first name");
        System.out.println("First name is: " +firstName);


        age = getInt(testScan, "Enter your age");
        System.out.println("You said your age is: " +age);


        salary =  getDouble(testScan, "Enter your salary");
        System.out.println("You said your salary is: " +salary);


        favNum = getInt(testScan, "Enter your favorite number");
        System.out.println("Your favorite number is: " + favNum);


        salary = getRangedDouble(testScan, "Enter your salary: ", 300 , 100000);
        System.out.println("Your salary is: " + salary);




        yesOrNo = SafeInput.getYNConfirm(testScan, "Yes or No? [Y/N]");
        System.out.println("You entered: " + yesOrNo + "!");

        yearOfBirth = getRangedInt(testScan, "Enter the year you were born", 1950, 2015);
        monthOfBirth =getRangedInt(testScan, "Enter the month you were born", 1, 12);
        dayOfBirth = getRangedInt(testScan, "Enter the day you were born", 1, 31);
        System.out.println("Your were born on " + monthOfBirth +" " + dayOfBirth + " " + yearOfBirth);


        itemPrice = getRangedDouble(testScan, "Enter the price of your item: ", 0.50, 10);
        System.out.printf("The price of your item is " + itemPrice);
        yesOrNo = getYNConfirm(testScan, " Add another item? [Y/N]: ");
*/

    }
    //methods go after main!

    /**
     * returns a string input by the user that must be at least one character
     *
     * @param pipe   the scanner to use for the input
     * @param prompt the message for the user telling them what to input
     * @return a string of at least one character
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        boolean done = false;
        String response = "";


        do {

            System.out.print(prompt + ": ");
            response = pipe.nextLine();

            if (response.length() > 0)
                done = true;
            else
                System.out.println("\nYou must enter at least one character!\n");


        } while (!done);

        return response;
    }

    /**
     * gets an int val from the user with no constraints
     *
     * @param pipe   scanner to use for input
     * @param prompt msg to user for what to enter
     * @return any valid int
     */

    public static int getInt(Scanner pipe, String prompt) {

        boolean done = false;
        String trash = "";
        int value = 0;


        do {

            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine(); //clear buffer
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered: " + trash);
            }


        } while (!done);

        return value;
    }

    /**
     * gets an int val from the user with no constraints
     *
     * @param pipe   scanner to use for input
     * @param prompt msg to user for what to enter
     * @return any valid int
     */


    public static double getDouble(Scanner pipe, String prompt) {
        boolean done = false;
        String trash = "";
        double salary = 0;

        do {

            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                salary = pipe.nextDouble();
                pipe.nextLine(); //clear buffer
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a whole number. You entered: " + trash);
            }


        } while (!done);

        return salary;
    }

    /**
     * gets an int val from the user with no constraints
     *
     * @param pipe   scanner to user for input
     * @param prompt msg to user
     * @param low    bottom value for the inclusive rsnge
     * @param high   top value for the inclusive range
     * @return any valid int
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {

        boolean done = false;
        String trash = "";
        int value = 0;


        do {

            System.out.print(prompt + " [ " + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine(); //clear buffer

                if (value >= low && value <= high)
                    done = true;

                else
                    System.out.println("\nYou must enter a value within the range [" + low + " - " + high + " ]: " + value);
            } else {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered: " + trash);
            }


        } while (!done);

        return value;
    }

    /**
     * gets a doible value with an inclusive range
     *
     * @param pipe   scanner to use for input
     * @param prompt
     * @param low
     * @param high
     * @return
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        boolean done = false;
        String trash = "";
        double value = 0;


        do {

            System.out.print(prompt + " [ " + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine(); //clear buffer

                if (value >= low && value <= high)
                    done = true;

                else
                    System.out.println("\nYou must enter a value within the range [" + low + " - " + high + " ]: " + value);
            } else {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered: " + trash);
            }


        } while (!done);

        return value;
    }

    /**
     * @param pipe
     * @param prompt
     * @return
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt) {

        boolean done = false;
        boolean retVal = false;
        String userInput = "";


        do {

            System.out.print(prompt + ": ");
            userInput = pipe.nextLine();

            if (userInput.toUpperCase().matches("[YN]"))
                retVal = true;
            else if (userInput.equalsIgnoreCase("n"))
                retVal = false;
            else
                System.out.println("You must enter Y/N");

        }
        while (!done);

        return retVal;
    }

    /**
     *
     * @param pipe
     * @param prompt
     * @param regEx the regEx pattern in java String format to use for matching
     * @return
     */
    //public static String getRegExString(Scanner pipe, String prompt, String regEx)


    /**
     * Takes a regEx string and returns a valid match from the user
     *
     * @param pipe   Scanner to use for input
     * @param prompt Message to user telling them what is needed for input
     * @param regEx  A string that represents a regular expression to use for the test
     * @return a string value that matches the regular expression
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        boolean done = false;
        String response = "";
        do {
            System.out.print(prompt + " " + regEx + ": ");
            response = pipe.nextLine();

            if (response.matches(regEx))
                done = true;
            else
                System.out.println("\nYou must enter a string that matches the pattern " + regEx + "!\n");

        } while (!done);

        return response;
    }
}










