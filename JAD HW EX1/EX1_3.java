//reference: https://www.geeksforgeeks.org/java-program-to-get-a-character-from-a-string/
//reference: https://www.journaldev.com/13115/convert-char-to-string-java

import java.util.Scanner;

class String_to_integer {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner UserNum = new Scanner(System.in); // this creatsa an object for the prgrammer to use as input
        String n = UserNum.nextLine();
        int index = n.length();// this will help iterate through the input to check if there is anything else
                               // other than numbers

        char ch = n.charAt(0);
        if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7'
                || ch == '8' || ch == '9') {
            /*
             * String to int converstion idea grab the individual characters and check to
             * see if they are numbers to begin with. once you grab the characters (numbers)
             * put them into a new int (find out a way to do this) once that new string is
             * fill with numbers, convert it into numbers alternativly, find a way to put
             * all the numbers into a int
             */
            // String newNumber = ""; //= String.valueOf(n.charAt(0));
            String IndexString = "";
            for (int i = 0; i < index; i++) {
                char indexCH = n.charAt(i);
                String str = String.valueOf(indexCH); // I need something like this to convert char to string
                if (indexCH == '0' || indexCH == '1' || indexCH == '2' || indexCH == '3' || indexCH == '4'
                        || indexCH == '5' || indexCH == '6' || indexCH == '7' || indexCH == '8' || indexCH == '9') {
                    // find a way to merge the characters into a single string
                    IndexString = IndexString + str;
                    System.out.println(IndexString);
                    int number = Integer.parseInt(IndexString);
                    System.out.println(number);
                } else {
                    // intentionaly left blank
                }
            }

        } else {
            System.out.println("This is not a number");
            System.exit(0);
        }

    }
}