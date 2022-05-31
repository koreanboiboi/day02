package myapp;

import java.io.Console;


public class WhileLoopSum {

    public static void main(String[] args) {

        int operand = 0;
        int result = 0;

        Console cons = System.console();
        String input = "ABC";

        while(input.length()>0){
            input = cons.readLine("Please enter a number, Blank to end ");
            if(input.length()>0) {
                operand = Integer.parseInt(input);
                result = result + operand;
                System.out.printf("The sum is  %d\n", input);
                
            }

        }

        System.out.println("Bye bye");
    
    }
}
