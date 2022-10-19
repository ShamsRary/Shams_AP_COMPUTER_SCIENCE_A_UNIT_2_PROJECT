import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome ");
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

        LinearEquation test1 = new LinearEquation(num1x, num1y, num2x, num2y);
        test1.lineInfo();
        System.out.println("Enter a value for x: ");
        double point = scan.nextDouble();
        test1.pointer(point);
    }
}
