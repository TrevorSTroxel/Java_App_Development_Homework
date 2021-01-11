import java.util.Scanner;

class Odd_or_Even {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        int n;
        System.out.println("Please input a number between 10 and 100");
        Scanner UserNum = new Scanner(System.in); // this creatsa an object for the prgrammer to use as input
        n = UserNum.nextInt(); // this grabs the users input and puts it into an object

        if (n % 2 == 0) {
            System.out.println("The number is even");
            for (int i = 0; i < n + 1; i++) {
                System.out.println(n);
            }
        } else if (n % 2 == 1) {
            System.out.println("The number is odd");
            for (int i = 0; i < n + 1; i++) {
                System.out.println(n);
            }
        } else {
            System.out.println("This input is not a simple number");
        }
    }
}