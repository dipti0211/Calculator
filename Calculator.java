import java.util.*;
public class Calculator{
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter any two numbers: -- ");
		int num1=inp.nextInt();
		int num2=inp.nextInt();
		System.out.println("Here are two numbers: -- "+num1+" & "+num2);

       System.out.println("Choose an operation to be performed : ");
       System.out.println("1. +");
       System.out.println("2. -");
       System.out.println("3. *");
       System.out.println("4. /");
       System.out.println("5. %");

        char operator = inp.next().charAt(0);

        int result;

        switch(operator)
        {
        // performs addition between numbers
      case '+':
        result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        break;

      // performs subtraction between numbers
      case '-':
        result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
        break;

      // performs multiplication between numbers
      case '*':
        result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
        break;

      // performs division between numbers
      case '/':
        result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);
        break;
 
      // performs modulo division between numbers
      case '%':
        result = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
        }


	}
}