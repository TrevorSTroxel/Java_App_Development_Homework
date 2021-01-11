import java.util.Scanner;

class BMI {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        int pounds, inches;
        final double kilo = 0.45359237;
        final double meter = 0.0254;
        System.out.println("Insert your weight in pounds");
        Scanner UserWeight = new Scanner(System.in); // this creatsa an object for the prgrammer to use as input
        pounds = UserWeight.nextInt();
        System.out.println("Insert your height in inches");
        Scanner UserInches = new Scanner(System.in); // this creatsa an object for the prgrammer to use as input
        inches = UserInches.nextInt();

        double WeightConverstion = pounds * kilo;
        double HeightConverstion = inches * meter;

        double BMI = WeightConverstion / Math.pow(HeightConverstion, 2);

        System.out.println("Your total BMI is " + BMI);
    }
}
