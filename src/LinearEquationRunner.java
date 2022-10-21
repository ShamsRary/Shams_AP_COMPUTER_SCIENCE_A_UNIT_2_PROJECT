import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //sss
        System.out.println("Welcome user ");
        //gains the coordinate info for the slope.
        System.out.println("Enter coordinate 1 ");
        String num1 = scan.nextLine();
        System.out.println("Enter coordinate 2 ");
        String num2 = scan.nextLine();

        // obtains the first digit to the last digit for the specific number and converts to integer
        int num1x = Integer.parseInt(num1.substring(1, num1.indexOf(",")));
        int num1y = Integer.parseInt(num1.substring(num1.indexOf(" ") + 1, num1.indexOf(")")));
        int num2x = Integer.parseInt(num2.substring(1, num2.indexOf(",")));
        int num2y = Integer.parseInt(num2.substring(num2.indexOf(" ") + 1, num2.indexOf(")")));

//        test code
//        System.out.println(num1x);
//        System.out.println(num1y);
//        System.out.println(num2x);
//        System.out.println(num2y);


        if (num1x == num2x) {
            System.out.println ("Vertical line x = " + num1x);
        }
        else {
            LinearEquation obj = new LinearEquation(num1x, num1y, num2x, num2y);
            System.out.println(obj.lineInfo());
            System.out.println("Enter a value for x: ");
            double point = scan.nextDouble();
            System.out.println(obj.coordinateForX(point));
        }

    }
}
