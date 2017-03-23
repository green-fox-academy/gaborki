import java.util.Scanner;

/**
 * Created by Gabor on 23/03/2017.
 */
public class Calculator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Give me something to calculate! Operator first then space, first operand, space and then the second operand");

        String toCalculate = input.nextLine();

        System.out.println(operator(toCalculate));

    }

    private static int operator(String task) {

        int firstSpace = task.indexOf(" ");
        int secondSpace = task.indexOf(" ", firstSpace + 1);

        int a = Integer.parseInt(task.substring(firstSpace + 1, secondSpace));
        int b = Integer.parseInt(task.substring(secondSpace + 1));

        String sign = task.substring(0, firstSpace);

        int result = 3;

        if (sign.equals("+")) {
             return (a + b);
        }
        else if (sign.equals("-")) {
            return (a - b);
        }
        else if (sign.equals("*")) {
            return (a * b);
        }
        else if (sign.equals("/")) {
             return (a / b);
        }
        else if (sign.equals("%")) {
             return (a % b);
        }
        else {
            return 0;
        }
    }
}



// Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations:
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
