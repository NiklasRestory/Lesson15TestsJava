import java.util.Scanner;

public class letsfindaleapyear {

    public static void main(String[] args) {
        /*took user input*/
        /*int userInput = 4;
        function(userInput);*
         */
    }

    public boolean IsALeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a leap year:");
        int year = Integer.getInteger(scanner.nextLine());
        int userInput = 4/*obtained by user input*/;
        return IsDivisibleBy(year, 4) && (!IsDivisibleBy(year, 100) || IsDivisibleBy(year, 400));
    }

    public boolean MockIsALeapYewar(int year) {
        int userInput = 4;
        return IsDivisibleBy(year, 4) && (!IsDivisibleBy(year, 100) || IsDivisibleBy(year, 400));
    }

    public boolean IsALeapYear(int year) {
        return IsDivisibleBy(year, 4) && (!IsDivisibleBy(year, 100) || IsDivisibleBy(year, 400));
    }

    public boolean IsDivisibleBy(int number, int by) {
        return number % by == 0;
    }

    public void function(int i) {
    }
}
