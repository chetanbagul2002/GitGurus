import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
      double num1, num2, ans;
      char operator;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      num1 = input.nextDouble();
      num2 = input.nextDouble();
      System.out.print("Enter an operator (+, -, *, /): ");
      operator = input.next().charAt(0);
      switch(operator) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
      default: System.out.printf("Enter correct operator");
         return;
      }
      System.out.printf("Answer:" +" "+ans);
   }
}
