import java.util.ArrayList;

import java.util.*;
public class Store {

    Scanner sc = new Scanner(System.in);
    Random r = new Random();

    private List<String> itemName = new ArrayList<>();
    private List<Integer> itemID = new ArrayList<>();;
    private List<Integer> itemQuantity = new ArrayList<>();;
    private List<Double> itemPrice = new ArrayList<>();;

    public Store (){
        itemName.add("Bearbrand"); itemID.add(100000 + r.nextInt(900000)); itemPrice.add(10.50); itemQuantity.add(10);
        itemName.add("Alaska"); itemID.add(100000 + r.nextInt(900000)); itemPrice.add(10.50); itemQuantity.add(10);
        itemName.add("Gatorade"); itemID.add(100000 + r.nextInt(900000)); itemPrice.add(10.50); itemQuantity.add(10);
        itemName.add("Green Cross Alcohol"); itemID.add(100000 + r.nextInt(900000)); itemPrice.add(10.50); itemQuantity.add(10);
        itemName.add("Palmolive"); itemID.add(100000 + r.nextInt(900000)); itemPrice.add(10.50); itemQuantity.add(10);
        itemName.add("Colgate"); itemID.add(100000 + r.nextInt(900000)); itemPrice.add(10.50); itemQuantity.add(10);
        itemName.add("Tortillos_Cheese"); itemID.add(100000 + r.nextInt(900000)); itemPrice.add(10.50); itemQuantity.add(10);
        itemName.add("Tortillos_Barbeque"); itemID.add(100000 + r.nextInt(900000)); itemPrice.add(10.50); itemQuantity.add(10);
        itemName.add("Roller Coaster"); itemID.add(100000 + r.nextInt(900000)); itemPrice.add(10.50); itemQuantity.add(10);
        itemName.add("Safeguard_Small"); itemID.add(100000 + r.nextInt(900000)); itemPrice.add(10.50); itemQuantity.add(10);
        
    }

    public void addItem(){
        System.out.print("Name of an Item: ");
        String itemName1 = sc.nextLine();
        System.out.print("Enter Price of the Item: ");
        double itemPrice1 = sc.nextDouble();
        System.out.print("Enter quantity of this Item: ");
        int itemQuantity1 = sc.nextInt();
    }

    public void showItems (){
        String formattedHead = String.format("Item Name %25s","PriceItems left %25s","Item ID"); 
        System.out.println(formattedHead);
        for(int i = 0; itemName.size() > i; i++){
            System.out.println(itemName.get(i) + "\t" + itemPrice.get(i) + "\t" + itemQuantity.get(i) + "\t" + itemID.get(i) );
        }

    }


}
