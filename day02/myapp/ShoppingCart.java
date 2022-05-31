package myapp;
import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {

    public static void main(String[] args) {

        List<String> cart = new LinkedList<String>();

        
        
        Console cons = System.console();
        boolean stop = false;
        String input;
        int delIndex;

        //main loop
        while (!stop) {

            input = cons.readLine("> ");
            // add <list of space seperated tems>
            // list
            // del <idx>
            // end
            String[] terms = input.split(" ");

            switch (terms[0]) {
                case "add":
                if(terms.length <2){
                    System.err.println("Please provide fruit to add");
                } else {
                    input=terms[1]-1;
                    if (input<cart.size()) {
                    cart.add(input);
                    System.out.println("Added");}
                }
                    break;
                
                case "del":
                if(terms.length <2) {
                    System.err.println("Please provide an index to delete");
                } else {
                    delIndex = Integer.parseInt(terms[1])-1;
                    if (delIndex<cart.size()) {
                        cart.remove(delIndex);
                        System.out.println("Deleted");
                    } else {
                        System.err.println(("No such Error"));
                    }
                }
                    break;

                    case "list":
                    if(cart.size() > 0) {
                        for(int i=0; i < cart.size(); i++) {
                            System.out.printf("%d. %s\n",(i+1),cart.get(i));
                        }
                    } else {
                        System.out.println("Your cart is empty");
                    }
                    break;

                case "end":
                    stop = true;
                    break;
            }

            System.out.printf("Read: %s\n", input);

        }

    }
    
}
