import java.util.ArrayList;

import java.util.*;
public class Store {

    Scanner sc = new Scanner(System.in);
    Random r = new Random();

    private List<String> itemName = new ArrayList<>();
    private List<Integer> itemID = new ArrayList<>();
    private List<Integer> itemQuantity = new ArrayList<>();
    private List<Double> itemPrice = new ArrayList<>();

    private List<String> itemName_Cart = new ArrayList<>();
    private List<Integer> itemID_Cart = new ArrayList<>();
    private List<Integer> itemQuantity_Cart = new ArrayList<>();
    private List<Double> itemPrice_Cart = new ArrayList<>();
    

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
        String itemName1 = sc.nextLine(); itemName.add(itemName1);
        System.out.print("Enter Price of the Item: ");
        double itemPrice1 = sc.nextDouble(); itemPrice.add(itemPrice1);
        System.out.print("Enter quantity of this Item: ");
        int itemQuantity1 = sc.nextInt(); itemQuantity.add(itemQuantity1);
        itemID.add(100000 + r.nextInt(900000));
    }

    public void showItems (){
        System.out.println(itemName.size());
        String formattedItemName = String.format("     Item Name %15s","");
        String formattedItemPrice = String.format("Price %10s","");
        String formattedItemLeft = String.format("Item Left %10s","");
        String formattedItemID = String.format("Item ID %10s","");
        System.out.println(formattedItemName + formattedItemPrice + formattedItemLeft + formattedItemID);
        
        for(int i = 0; itemName.size() > i; i++){ //Displaying store items
            int itemName_indent = itemName.get(i).length()-25;
            int num = i + 1;
            String form_itemName = String.format(itemName.get(i)+"%"+ itemName_indent+"s","");
            String form_itemPrice = String.format(itemPrice.get(i)+"%15s","");
            String form_itemQuantity = String.format(itemQuantity.get(i)+"%15s","");
            String form_itemID = String.format(itemID.get(i)+"%10s","");

            if(i<9){
                System.out.println("["+0+num+"] "+form_itemName + form_itemPrice + form_itemQuantity + form_itemID);
            }
            else{
                System.out.println("["+num+"] "+form_itemName + form_itemPrice + form_itemQuantity + form_itemID);   
            }
        }

        System.out.println("\nInsert the Item Number that you would like to purchase: ");
        Object itemChoice = sc.nextInt();

        while (!(itemChoice instanceof Integer)){
            System.out.println("\nInvalid input! Insert the Item Number that you would like to purchase: ");
            itemChoice = sc.nextInt();
        }

        int itemChoiceVal = (Integer) itemChoice;
        while(itemChoiceVal <= 0 || itemChoiceVal > itemName.size()){
            System.out.println("\nInput Out of Range! Insert the Item Number that you would like to purchase: ");
            itemChoiceVal = sc.nextInt();
        }

        itemName.add(itemName.get(itemChoiceVal)); itemPrice.add(itemPrice.get(itemChoiceVal)); itemQuantity.add(1); itemID_Cart.add(itemID.get(itemChoiceVal));

        System.out.println("Great");
    }

    public void showCart() {
        for(int i = 0; itemName_Cart.size() > i; i++){ //Displaying store items
            int itemName_indent = itemName_Cart.get(i).length()-25;
            int num = i + 1;
            String form_itemName = String.format(itemName_Cart.get(i)+"%"+ itemName_indent+"s","");
            String form_itemPrice = String.format(itemPrice_Cart.get(i)+"%15s","");
            String form_itemQuantity = String.format(itemQuantity_Cart.get(i)+"%15s","");
            String form_itemID = String.format(itemID_Cart.get(i)+"%10s","");

            if(i<9){
                System.out.println("["+0+num+"] "+form_itemName + form_itemPrice + form_itemQuantity + form_itemID);
            }
            else{
                System.out.println("["+num+"] "+form_itemName + form_itemPrice + form_itemQuantity + form_itemID);   
            }
        }
    }

}
