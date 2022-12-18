import java.util.*;
public class Terminal {
    public void startTerminal(boolean masterCardStat){
        
        Scanner sc = new Scanner(System.in);
        Store store = new Store();
        
        Card card = new Card (); card.setMasterCardStat(masterCardStat);
        actionMenu();

        System.out.print("Enter Action Number: ");
        int actionNum = sc.nextInt();

        
        
        while(actionNum > 6 || actionNum < 1){
            actionMenu();
            System.out.println("\nInvalid Action Number! Please try another number: ");
            actionNum = sc.nextInt();
        }

        switch (actionNum){
            case 1:
                //card
        }


    }

    public void actionMenu (){
        System.out.println("1. Show Card Info");
        System.out.println("2. Access Store (Mastercard Access)");
        System.out.println("3. Show Items");
        System.out.println("4. Add Balance");
        System.out.println("5. Access Shopping Cart");
        System.out.println("6. Payment");

    }

    public void goodByeMessage(){
        System.out.println("Thank you for shopping with us, I hope you will come back soon! ");
    }





}
