import java.util.Scanner;

public class Favnumber {

    public static Scanner testScan = new Scanner(System.in);
    public static void main(String[] args){
        double favNum = 0;

        favNum = SafeInput.getDouble(testScan, "Enter your favorite number");
        System.out.println("Your favorite number is: " + favNum);


    }

}
