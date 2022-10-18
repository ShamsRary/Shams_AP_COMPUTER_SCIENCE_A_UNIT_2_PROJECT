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
        System.out.println(num1);
        // obtains the first digit to the last digit for the specific number and converts to integer
        int num1x = Integer.parseInt(num1.substring(1, num1.indexOf(",")));
        int num2x = Integer.parseInt(num1.substring(num1.indexOf(" ") + 1, num1.indexOf(")")));
        int num1y = Integer.parseInt(num2.substring(1, num2.indexOf(",")));
        int num2y = Integer.parseInt(num2.substring(num2.indexOf(" ") + 1, num2.indexOf(")")));

        //LinearEquation first = new LinearEquation(num1, num2);
        //String check = first.lol();
        System.out.print(num1);
    }
}
