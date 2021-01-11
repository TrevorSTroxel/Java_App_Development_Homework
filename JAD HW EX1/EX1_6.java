import java.util.Scanner;

//These classes I found on this site:https://www.javatpoint.com/java-get-current-date
//Reference: https://www.javatpoint.com/java-string-to-date
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.*; //this is used for better caclculation for the date differences
import java.util.concurrent.TimeUnit; //This will help get better calculation between different dates
import java.text.ParseException; //this helps with the converstion of strings to dates

class CalanderDate {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        do {
            System.out.println("What do you want to do with the calander?");
            System.out.println("1. Create A Event on a Date");
            System.out.println("2. Get Todays Date"); // static function
            System.out.println("3. Get to amount of days between to dates");
            System.out.println("4. Make An Event For The Future");

            int choice;
            Scanner UserChoice = new Scanner(System.in);
            choice = UserChoice.nextInt();
            LocalDate TodayDate = java.time.LocalDate.now();

            switch (choice) {
                case 1:
                    System.out.println("On what date would you like to create an event?");
                    System.out.println("Please enter the date with the format DD-MM-YYYY");
                    String Date;
                    Scanner UserDate = new Scanner(System.in);
                    Date = UserDate.nextLine();
                    DateValidation(Date);
                    if (DateValidation(Date) == true) {
                        String Event;
                        System.out.println("What do you want to do on that day?");
                        Scanner UserEvent = new Scanner(System.in);
                        Event = UserEvent.nextLine();
                        System.out.println("On " + Date + " you will do this: " + Event);
                        break;
                    } else {
                        System.out.println("Invalid Input");
                        break;
                    }
                case 2:
                    // The LocalDate type is part of the libraries I imported
                    System.out.println("Todays Date is: " + TodayDate);
                    break;
                case 3:
                    System.out.println("Where do you want to start?");
                    System.out.println("Please enter the date with the format DD-MM-YYYY");

                    String FirstDate;
                    Scanner UserFirstDate = new Scanner(System.in);
                    FirstDate = UserFirstDate.nextLine();
                    DateValidation(FirstDate);

                    if (DateValidation(FirstDate) == true) {
                        System.out.println("What is the second date?");
                        String SecondDate;
                        Scanner UserSecondDate = new Scanner(System.in);
                        SecondDate = UserSecondDate.nextLine();

                        DateValidation(SecondDate);
                        // I could not get the calculation to work in this program, so I moved it to
                        // another void function to calculate things out
                        if (DateValidation(SecondDate) == true) {
                            DateDifferences(FirstDate, SecondDate);
                            break;
                        } else {
                            System.out.println("You put in a invalid date.");
                            break;
                        }
                    } else {
                        System.out.println("You put in a invalid date.");
                        break;
                    }
                case 4:
                    System.out.println("Todays Date is: " + TodayDate);
                    System.out.println("How many days in the future would you like to create the event?");
                    int FutureDate;
                    Scanner UserFutreDate = new Scanner(System.in);
                    FutureDate = UserFutreDate.nextInt();
                    Calendar calendar = Calendar.getInstance();
                    calendar.add(Calendar.DATE, FutureDate);
                    System.out.println(
                            FutureDate + " days from " + TodayDate + " is going to be on " + calendar.getTime());
                    break;
                default:
                    System.out.println("You put in a invalid response.");
                    break;
            }
        } while (true);
    }

    
    /** 
     * @param inputDate
     * @return boolean
     */
    // This will be used to check if the date that was inputed is correct
    static boolean DateValidation(String inputDate) {
        // the try and catch statement are somewhat similar to a if and else statement
        // this try statement is used to catch exception in my program to that it may
        // complie correctly
        try {
            SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyyy");
            SDF.setLenient(false); // this tells the program that it will not tolorate wrong dates
            SDF.parse(inputDate); // This will test to see if the input is correct or not
            return true;
        } catch (ParseException e) {
            return false;
        }

    }

    
    /** 
     * @param FirstDate
     * @param SecondDate
     */
    // Used for calculating the differences between the two dates for case 3
    static void DateDifferences(String FirstDate, String SecondDate) {
        SimpleDateFormat DC = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date date1 = DC.parse(FirstDate);
            Date date2 = DC.parse(SecondDate);

            // This will be used for calculating the amount of days between the two dates
            long time_difference = date2.getTime() - date1.getTime();

            long day_difference = TimeUnit.MILLISECONDS.toDays(time_difference);

            System.out.print("Difference between two dates is: " + day_difference + " days ");
        }

        // This is used for when exceptions are thrown, this is where they go
        catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
