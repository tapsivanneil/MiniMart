import java.util.ArrayList;

import java.util.*;
public class Store {


    Scanner sc = new Scanner(System.in);

    ArrayList itemName = new ArrayList<>();
    ArrayList itemID = new ArrayList<>();
    ArrayList itemQuamtity = new ArrayList<>();
    ArrayList itemPrice = new ArrayList<>();
    
    public void addItem(boolean masterCardStat){

        if(masterCardStat == true){
            System.out.print("Name of an Item: ");
            String itemName = sc.nextLine();
            System.out.print("Enter Price of the Item: ");
            double itemPrice = sc.nextDouble();
            System.out.print("Enter quantity of this Item: ");
            int itemQuantity = sc.nextInt();
        }
        else{
            System.out.println("You don't have access to this section! \n"
            + "Only a person with mastercard can access this section ");
        }
    }


}
