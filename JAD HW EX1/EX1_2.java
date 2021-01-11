import java.util.Scanner; 
class Area_of_a_Circle {
    public static void main(String[] args){
        int n;
        final double PI = 3.14;
        System.out.println("What is the radius of the circle");
        Scanner UserNum = new Scanner(System.in); //this creatsa an object for the prgrammer to use as input
        n = UserNum.nextInt(); //this grabs the users input and puts it into an object

        double square = Math.pow(n, 2);

        double area = PI * square;

        System.out.printf("the area of the circle is " + area);
    }
}