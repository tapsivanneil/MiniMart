import java.util.ArrayList;

import java.util.*;
public class Store {

    Scanner sc = new Scanner(System.in);

    ArrayList itemName = new ArrayList<>();
    ArrayList itemID = new ArrayList<>();
    ArrayList itemQuantity = new ArrayList<>();
    ArrayList itemPrice = new ArrayList<>();

    public void addItem(){


        System.out.print("Name of an Item: ");
        String itemName1 = sc.nextLine();
        System.out.print("Enter Price of the Item: ");
        double itemPrice1 = sc.nextDouble();
        System.out.print("Enter quantity of this Item: ");
        int itemQuantity1 = sc.nextInt();

        itemName.add(itemName1); itemPrice.add(itemPrice1); itemQuantity.add(itemQuantity1);
        System.out.println(itemName.get(0) + "\t" + itemPrice.get(0) + "\t" + itemQuantity.get(0) + "\t" + itemID.get(0) );
        
    }

    public void showItems (){
        System.out.println("Item Name\tItem Price\tItems left\tItem ID");
        for(int i = 1; itemName.size() > i; i++){
            System.out.println(itemName.get(i) + "\t" + itemPrice.get(i) + "\t" + itemQuantity.get(i) + "\t" + itemID.get(i) );
        }
    }


}
