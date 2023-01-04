import java.util.*;
public class Terminal {
    public void startTerminal(){
        
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        Store store = new Store(); 
        
        //store.showItems(); //for item testing only
        Card card = new Card ();  card.setIdNum(100000 + r.nextInt(900000));
        //insert rand card num for idNUM
        Mastercard mc = new Mastercard();

        System.out.print("\nPlease enter your name: ");
        String cusName = sc.nextLine();
        System.out.print("\n You're " + cusName + ", is that right? [1] Yes [2] No : ");
        int confirmName = sc.nextInt();

        while(confirmName !=1 && confirmName != 2){
            System.out.println("Invalid answer! Please try again.");
            System.out.print("\n You're " + cusName + ", is that right? [1] Yes [2] No : ");
            confirmName = sc.nextInt();
        }

        while(confirmName == 2){
            System.out.print("\nPlease enter your name: ");
            cusName = sc.nextLine(); //doubling input because of the nextLine function
            cusName = sc.nextLine();

            System.out.print("\n You're " + cusName + ", is that right? [1] Yes [2] No : ");
            confirmName = sc.nextInt();

            if(confirmName == 1){
                card.setCardName(cusName);
                break;
            }
        }
        if(confirmName == 1){
            card.setCardName(cusName);
        }

        System.out.println("\nGood Day "+ card.getCardName() + "! Welcome to Minimart \n");
        
        while(true){
            
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
                    card.showCardInfo();
                    break;
                case 2:
                    System.out.print("Please enter the mastercard password: ");
                    int masPass = sc.nextInt();

                    int attempt = 3;
                    while(masPass != mc.getMasterCardPass() && attempt >=1){
                        System.out.print("Please enter the mastercard password (Remaining attempts:  " + attempt + "): ");
                        masPass = sc.nextInt();
                        attempt --;
                    }
                    if (attempt < 1){
                        break;
                    }

                    if (masPass == mc.getMasterCardPass()){
                        store.addItem();
                    }
                    break;
                case 3:
                    store.showItems();
                    break;
                case 4:
                    card.setCardBalance();
                    break;
                case 5:
                    store.showCart();
                    break;
                case 6:
                    store.payment();
                    break;
                    
            }
        }
    }
    public void actionMenu (){
        System.out.println("\n1. Show Card Info");
        System.out.println("2. Access Store (Mastercard Access)");
        System.out.println("3. Buy Items");
        System.out.println("4. Load you Card");
        System.out.println("5. Access Shopping Cart");
        System.out.println("6. Payment\n");
    }
    
    public void goodByeMessage(){
        System.out.println("Thank you for shopping with us, I hope you will come back soon! ");
    }





}
