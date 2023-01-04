import java.util.ArrayList;
import java.net.SocketTimeoutException;
import java.rmi.StubNotFoundException;
import java.util.*;
public class Store {

    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    Card card = new Card();

    double totalAmount;

    private List<String> itemName = new ArrayList<>();
    private List<Integer> itemID = new ArrayList<>();
    private List<Integer> itemQuantity = new ArrayList<>();
    private List<Double> itemPrice = new ArrayList<>();

    private List<String> itemName_Cart = new ArrayList<>();
    private List<Integer> itemID_Cart = new ArrayList<>();
    private List<Integer> itemQuantity_Cart = new ArrayList<>();
    private List<Double> itemPrice_Cart = new ArrayList<>();

    private List<String> itemName_Receipt = new ArrayList<>();
    private List<Integer> itemID_Receipt = new ArrayList<>();
    private List<Integer> itemQuantity_Receipt = new ArrayList<>();
    private List<Double> itemPrice_Receipt = new ArrayList<>();
    

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

        System.out.print("\nInsert the Item Number that you would like to purchase: ");
        //Object itemChoice = sc.nextInt();

        // while (!(itemChoice instanceof Integer)){
        //     System.out.println("\nInvalid input! Insert the Item Number that you would like to purchase: ");
        //     itemChoice = sc.nextInt();
        // }

        //int itemChoiceVal = (Integer) itemChoice;

        int itemChoiceVal = sc.nextInt();

        while(itemChoiceVal <= 0 || itemChoiceVal > itemName.size()){
            System.out.println("\nInput Out of Range! Insert the Item Number that you would like to purchase: ");
            itemChoiceVal = sc.nextInt() - 1;
        }

        System.out.print("Enter Quantity (Remaining Items: "+ itemQuantity.get(itemChoiceVal) +"): ");
        int quantity = sc.nextInt();

        while(itemName.size()< quantity){
            System.out.println("Invalid input! We don't have that much " + itemName.get(itemChoiceVal));
            System.out.print("Enter Quantity (Remaining Items: "+ itemQuantity.get(itemChoiceVal) +"): ");
            quantity = sc.nextInt();
        }
        itemQuantity.set(itemChoiceVal, itemQuantity.get(itemChoiceVal) - quantity); // deducting bought items in the list
        itemName_Cart.add(itemName.get(itemChoiceVal)); itemPrice_Cart.add(itemPrice.get(itemChoiceVal)); itemQuantity_Cart.add(quantity); itemID_Cart.add(itemID.get(itemChoiceVal));

    }

    public void showCart() {

        if (itemName_Cart.size() == 0){
            System.out.println("There are no items in your cart");
        }
        else{
            String formattedItemName = String.format("     Item Name %15s","");
            String formattedItemPrice = String.format("Price %10s","");
            String formattedQuantity = String.format("Quantity %10s","");
            String formattedItemID = String.format("Item ID %10s","");
            System.out.println(formattedItemName + formattedItemPrice + formattedQuantity + formattedItemID);

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
                totalAmount += itemPrice_Cart.get(i) * itemQuantity_Cart.get(i);
            }
        }
        System.out.println("\nTotal Amount: " + totalAmount);

        System.out.println("\nWhat do you want to do with your cart?");
        System.out.println("[1] Add more item(s)");
        System.out.println("[2] Remove item(s)");
        System.out.println("[3] Empty cart");
        System.out.println("[4] Exit\n");

        System.out.print("Enter action number: ");
                    int cartActionNum = sc.nextInt();

                    while(cartActionNum <=0 || cartActionNum > 4){
                        System.out.print("Enter action number: ");
                        cartActionNum = sc.nextInt();
                    }
                    if (cartActionNum == 1){showItems();}
                    
                    else if(cartActionNum == 2){
                        System.out.print("Enter the item number that you would like to remove: ");
                        int remItem = sc.nextInt() -1 ;  // minus 1 to fix the indexing

                        while(remItem > itemName_Cart.size() || remItem < 0){
                            System.out.println("Invalid input! Try another number: ");
                            remItem = sc.nextInt() - 1; // minus 1 to fix the indexing
                        }

                        System.out.print("How many " + itemName_Cart.get(remItem) + " to remove ("+ itemQuantity_Cart.get(remItem)+" item(s) in the cart)? ");
                        int remItem_Quan = sc.nextInt();

                        while(remItem_Quan > itemQuantity_Cart.get(remItem) || remItem_Quan <= 0){
                            System.out.print("Invalid input! Try another number ("+ itemQuantity_Cart.get(remItem)+" item(s) in the cart): ");
                            remItem_Quan = sc.nextInt();
                        }

                        System.out.print("Would you like to remove " + remItem_Quan +" "+itemName_Cart.get(remItem) + "? [1] Yes [2] No  ");
                        int valChoice = sc.nextInt();

                        while(valChoice > 2 || valChoice <= 0){
                            System.out.print("Invalid Input! Would you like to remove " + remItem_Quan +" "+ itemName_Cart.get(remItem) + "? [1] Yes [2] No  ");
                            valChoice = sc.nextInt(); 
                        }

                        if (valChoice == 1){
                            if(itemQuantity_Cart.get(remItem) == remItem_Quan){
                                itemName_Cart.remove(remItem); itemPrice_Cart.remove(remItem); itemQuantity_Cart.remove(remItem); itemID_Cart.remove(remItem);
                            }
                            else{
                                itemQuantity_Cart.set(remItem, itemQuantity_Cart.get(remItem) - remItem_Quan);
                            }
                        }
                        else if (valChoice == 2){
                            showCart();
                        }
                    }
                    else if (cartActionNum == 3){

                        System.out.println("Are you sure that you want to clear your cart? [1] Yes [2] No : ");
                        int resetChoice = sc.nextInt();

                        while(resetChoice > 2 || resetChoice < 1){
                            System.out.println("Invalid Input!");
                            System.out.println("Are you sure that you want to clear your cart? [1] Yes [2] No : ");
                            resetChoice = sc.nextInt();
                        }

                        if (resetChoice == 1){
                            for (int i = 0; i < itemName_Cart.size(); i++){
                                itemName_Cart.remove(i); itemPrice_Cart.remove(i); itemQuantity_Cart.remove(i); itemID_Cart.remove(i);
                            }
                            showCart();
                        }
                        else if (resetChoice == 2) {
                            showCart();
                        }      
                    }

                    else if (cartActionNum == 4){
                       
                    }
    }

    public void payment(){
        String formattedItemName = String.format("     Item Name %15s","");
        String formattedItemPrice = String.format("Price %10s","");
        String formattedQuantity = String.format("Quantity %10s","");
        String formattedItemID = String.format("Item ID %10s","");
        System.out.println(formattedItemName + formattedItemPrice + formattedQuantity + formattedItemID);

        for(int i = 0; itemName_Cart.size() > i; i++){ //Displaying store items
            int num = i + 1;
            int itemName_indent = itemName_Cart.get(i).length()-25;
            String form_itemPrice = String.format(itemPrice_Cart.get(i)+"%15s","");
            String form_itemName = String.format(itemName_Cart.get(i)+"%"+ itemName_indent+"s","");
            String form_itemID = String.format(itemID_Cart.get(i)+"%10s","");
            String form_itemQuantity = String.format(itemQuantity_Cart.get(i)+"%15s","");

                if(i<9){
                    System.out.println("["+0+num+"] "+form_itemName + form_itemPrice + form_itemQuantity + form_itemID);
                }
                else{
                    System.out.println("["+num+"] "+form_itemName + form_itemPrice + form_itemQuantity + form_itemID);   
                }
                totalAmount += itemPrice_Cart.get(i) * itemQuantity_Cart.get(i);
                System.out.println("\nTotal Amount: " + totalAmount);
                
                System.out.println("\n[1] Proceed to payment ");
                System.out.println("[2] Cancel ");
                System.out.print("\nEnter Action Num: ");
                int payChoice = sc.nextInt();

                while(payChoice > 2 || payChoice < 1){
                    System.out.print("\nEnter Action Num: ");
                    payChoice = sc.nextInt();
                }

                if(payChoice == 1){
                    if(card.getCardBalance() < totalAmount){
                        System.out.println("Insufficient Balance! Please load your card");
                    }
                    else{
                        card.setCardBalance(card.getCardBalance() - totalAmount);
                        System.out.println("Payment Successful!");
                        card.showCardInfo();

                        for (int receiptIndex = 0; receiptIndex < itemName_Cart.size(); receiptIndex ++ ){
                            itemName_Receipt.add(itemName_Cart.get(receiptIndex)); 
                            itemQuantity_Receipt.add(itemQuantity_Cart.get(receiptIndex)); 
                            itemPrice_Receipt.add(itemPrice_Cart.get(receiptIndex)); 
                            itemID_Receipt.add(itemID_Cart.get(receiptIndex));
                        }
                        
                        System.out.println("Offcial Receipt Card #"  + card.getIdNum());
                        String formattedItemName_r = String.format("     Item Name %15s","");
                        String formattedItemPrice_r = String.format("Price %10s","");
                        String formattedQuantity_r = String.format("Quantity %10s","");
                        String formattedItemID_r = String.format("Item ID %10s","");
                        System.out.println(formattedItemName + formattedItemPrice + formattedQuantity + formattedItemID);

                        for(int i_r = 0; itemName_Cart.size() > i; i++){ //Displaying store items
                            int num_r = i + 1;
                            int itemName_indent_r = itemName_Cart.get(i_r).length()-25;
                            String form_itemPrice_r = String.format(itemPrice_Cart.get(i_r)+"%15s","");
                            String form_itemName_r = String.format(itemName_Cart.get(i_r)+"%"+ itemName_indent+"s","");
                            String form_itemID_r = String.format(itemID_Cart.get(i_r)+"%10s","");
                            String form_itemQuantity_r = String.format(itemQuantity_Cart.get(i_r)+"%15s","");

                            if(i_r<9){
                                System.out.println("["+0+num+"] "+form_itemName_r + form_itemPrice_r + form_itemQuantity_r + form_itemID_r);
                            }
                            else{
                                System.out.println("["+num+"] "+form_itemName_r + form_itemPrice_r + form_itemQuantity_r + form_itemID_r);   
                            }
                            totalAmount += itemPrice_Receipt.get(i) * itemQuantity_Receipt.get(i);
                            System.out.println("\nTotal Amount: " + totalAmount);
                        }

                    }
                }
        
    }
}
}