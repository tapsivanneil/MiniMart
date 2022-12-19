import java.util.*;
public class Terminal {
    public void startTerminal(){
        
        Scanner sc = new Scanner(System.in);
        Store store = new Store();
        
        Card card = new Card ();
        Mastercard mc = new Mastercard();
        actionMenu();

        System.out.print("\nPlease enter your name");
        String cusName = sc.nextLine();
        System.out.print("\n You're " + cusName + ", is that right? [1] Yes [2] No :");
        int confirmName = sc.nextInt();

        while(confirmName < 1 || confirmName > 2){
            System.out.println("Invalid answer! Please try again.");
            System.out.print("\n You're " + cusName + ", is that right? [1] Yes [2] No :");
            confirmName = sc.nextInt();
        }

        if(confirmName == 1){
            
        }

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
            case 2:
                System.out.print("Please enter the mastercard password: ");
                int masPass = sc.nextInt();

                if (masPass == mc.getMasterCardPass()){
                    startTerminal();
                }

                int attempt = 3;
                while(attempt >=1){
                    System.out.print("Please enter the mastercard password (Remaining attempts:  " + attempt + "): ");
                    masPass = sc.nextInt();
                    attempt --;
                }
                if (attempt < 1){
                    startTerminal();
                }
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
