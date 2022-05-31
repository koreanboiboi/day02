package myapp;

import java.io.Console;

public class IntMul {

    public static void main(String[] args) {
        Console cons = System.console();

        int result =0;
        int opnd = 0;
        String input = "";

        boolean stop = false;

        while (!stop) {
            input = cons.readLine("Enter a number; return to end ");
            if(input.length() > 0 ) {
                opnd = Integer.parseInt(input);
                result += opnd;
            } else
                stop = true;
        }
        System.out.printf("The result is %d\n" , result);
    }
    
}
