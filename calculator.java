package CSCI250.PROJECTS;
import java.util.Scanner;

public class calculator {
    static Scanner input = new Scanner(System.in);

    static void menu(){

        boolean quit = false;
        

    while( quit == false){
        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponential");
        System.out.println("6. Square Root");

        System.out.println("0. Quit.");
        
        System.out.println("\nPlease chose an integer number...");


        int choice = input.nextInt();

        switch(choice){

            case 0:
                System.out.println("GOODBYE! ");
                quit = true;
                break;
            case 1:
                add();
                break;
            case 2:
                subtract();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                division();
                break;
            case 5:
                exponents();
                break;
            case 6:
                sqrt();
                break;




            default:
                System.out.println("\nTry again...");

        }
       
    }

    }
    static Scanner userInput = new Scanner(System.in);    

    static void add(){
        int x;
        int y;        
        System.out.println("-- ADDITION -- \n");


    
    System.out.print("Enter first integer: ");
    x = userInput.nextInt();

    System.out.print("Enter second integer: ");
    y = userInput.nextInt();
    int sum = x+y;

        System.out.println("\n"+x + " + "+ y+ " = "+ sum);

    }

    static void subtract(){
        System.out.println("-- SUBTRACTION -- \n");
        // Scanner userInput = new Scanner(System.in);    

        System.out.print("Enter first integer: ");
    int x = userInput.nextInt();

    System.out.print("Enter second integer: ");
    int y = userInput.nextInt();
    int total = x-y;

        System.out.println("\n"+x + " - "+ y+ " = "+ total);

    }

    static void multiplication(){
        System.out.println("-- MULTIPLICATION -- \n");

        // Scanner userInput = new Scanner(System.in);    
    
        System.out.print("Enter first integer: ");
        int x = userInput.nextInt();
    
        System.out.print("Enter second integer: ");
        int y = userInput.nextInt();
        int product = x*y;
    
            System.out.println("\n"+x + " * "+ y+ " = "+ product);
    }

    static void division(){
        System.out.println("-- DIVISION -- \n");

        // Scanner userInput = new Scanner(System.in);    
    
        System.out.print("Enter first integer: ");
        int x = userInput.nextInt();
    
        System.out.print("Enter second integer: ");
        int y = userInput.nextInt();
        int quotient = x/y;
    
            System.out.println("\n"+x + " / "+ y+ " = "+ quotient);

    }

    static void exponents()
    {
        System.out.println("-- EXPONETIAL -- \n");

        // Scanner userInput = new Scanner(System.in);    
    
        System.out.print("Enter first integer: ");
        int x = userInput.nextInt();
    
        System.out.print("Enter second integer: ");
        int y = userInput.nextInt();
        int product = (int) Math.pow(x, y);

    
            System.out.println("\n"+x + " raised to the power of "+ y+ " = "+ product);
    }

    static void sqrt()
    {
        System.out.println("-- SQUARE ROOT -- \n");

        // Scanner userInput = new Scanner(System.in);    
    
        System.out.print("Enter first integer: ");
        int x = userInput.nextInt();

        int total = (int) Math.sqrt(x);
    
            System.out.println("\n"+"Square root of "+x +" = "+ total);
    }

    public static void main(String[] args) {
        menu();
        userInput.close();
        input.close();



    }
    
}
