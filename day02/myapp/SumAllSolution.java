package myapp;

public class SumAllSolution {
    public static void main(String[] args) {

        int operand = 0;
        int result = 0;

        for (int i =0; i < args.length; i++){

            System.out.printf("%s\n", args[i]);
            operand = Integer.parseInt(args[i]);
            result = result + operand;

        }
        System.out.printf("The result is %d\n", result);
    }
}
