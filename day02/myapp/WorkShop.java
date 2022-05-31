package myapp;

import java.io.Console;
import java.util.*;

public class WorkShop {

    public static void main(String[] args) {


        Console cons = System.console();
        String input = "ABC";
        int index = 1;
        List<String> strList = new LinkedList<String>();
        System.out.println("Welcome to your shopping cart");
        while(input.length()>0){
            input = cons.readLine(">");
            if(input.equals("list")) {
                if(strList.size()>0){
                    System.out.println(strList);
                } else {
                    System.out.println("Your cart is empty");
                }
                
            } else if(input.startsWith("add")){
                input = input.replaceAll("add", ""+index++ +".");
                strList.add(input);
                System.out.printf("%s has been added to cart\n",input);

            } else if(input.startsWith("del")){
                input = input.replaceAll("del", "");
                strList.remove(input);
                System.out.printf("%s has been removed from cart\n",input);

            }

        }
        

        
     }

        

        

        
        

        
}
