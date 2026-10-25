package problem1;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            scan.nextLine();
            item = new Item(itemName,itemPrice,quantity);
            cart.add(item);
            System.out.println("=== Carte Content ====");
            //this statement go to object.toString
            double totalPrice = 0.0;
            for(Item element : cart){
                System.out.println(element.getName() + " - $" + element.getPrice() + " : " + element.getQuantity() + " ones");
                totalPrice += element.getPrice() * element.getQuantity();
            }
            System.out.println("=> Total Price : "+ totalPrice);
            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
        }
        while (keepShopping.equals("y"));
    }
}
