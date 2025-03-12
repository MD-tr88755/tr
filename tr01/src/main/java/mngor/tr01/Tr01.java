
package mngor.tr01;

import java.util.Scanner;


public class Tr01 {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                System.out.println("1(+)   2(-)   3(*)   4(/)");
              int Cal=input.nextInt();
        switch(Cal) {
        
            case(1):
                System.out.println("Enter two values to sum");
               double a= input.nextDouble(),b = input.nextDouble();;
               double sum = a+b;
                System.out.println("The sum for the two values is:"+sum);
                break;
                
            case(2):
                System.out.println("Enter two values to subtract");
                double c = input.nextDouble(),d = input.nextDouble();
                double sub = c-d;
                System.out.println("The subtract of the two values is:"+sub);
                break;
                
            case (3):
                System.out.println("Enter two values to multiply");
                double e = input.nextDouble(),f = input.nextDouble();
                double mult = e*f;
                System.out.println("The result of the multiplication is:"+mult);
                break;
                
            case(4):
                System.out.println("Enter to values two divide");
                double g = input.nextDouble(),h = input.nextDouble();
                double divi = g/h;
                System.out.println("The divide of the two value equels to:"+divi);
        }
    } 
}