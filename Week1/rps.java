import java.util.Random;
import java.util.Scanner;
public class rps {
    public static void main(String[] args){
        Random rand = new Random();

        int  randomNumber = rand.nextInt(1,4);

        System.out.printf("random number: %d",randomNumber);
        
        String cpu="";
        if (randomNumber==1){
             cpu = "Rock";
        }
        else if (randomNumber==2){
             cpu = "Paper";
        }
        else if (randomNumber==3){
             cpu = "Scissors";
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("CHOOSE:\nrock\npaper\nscissors");
        String user = sc.nextLine().toLowerCase();

        switch (user) {
            case "rock":
                
                
                break;
        
            default:
                break;
        }
        }
    }

