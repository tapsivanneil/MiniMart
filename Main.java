import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Terminal t = new Terminal();
        Card c = new Card();
        
        System.out.print("Are you a buyer? [1] Yes [2] No : ");
        int mas = sc.nextInt();

        while(mas < 1 || mas > 2){
            System.out.println("Invalid Input! Please try again.");
            System.out.print("Are you a buyer? [1] Yes [2] No : ");
            mas = sc.nextInt(); 
        }

        if(mas == 1){
            t.startTerminal(false);
        }
        else{
            System.out.print("Please enter the mastercard password: ");
            int masPass = sc.nextInt();

            if (masPass == c.getMasterCardPass()){
                t.startTerminal(true);
            }

            int attempt = 3;
            while(attempt >=1){
                System.out.print("Please enter the mastercard password (Remaining attempts:  " + attempt + "): ");
                masPass = sc.nextInt();
                attempt --;
            }
            if (attempt < 1){
                t.goodByeMessage();
            }
        
        }
    
    }
}