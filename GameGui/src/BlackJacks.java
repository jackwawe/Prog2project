

import java.util.Random;
import java.util.Scanner;


public class BlackJacks {
    
     public static Scanner input = new Scanner(System.in);
     
     public static int playerDistribution() {

        int playerScore = 0;
        //System.out.println("Player's turn. Two cards are drawn.");
       String playerCard1 = playGame("faceUp");
        playerScore = points(playerScore, playerCard1);
        String playerCard2 = playGame("faceUp");
        playerScore += points(playerScore, playerCard2);
        //System.out.println("The Player's score is " + playerScore + ".\n");
        return playerScore;
    }
     
     public static int dealerDistribution() {

        int dealerScore = 0;
        //System.out.println("Dealer's turn. Two cards are drawn: one face-up and one face-down.");
        
        String dealerCardFaceUp = playGame("faceUp");
        dealerScore = points(dealerScore, dealerCardFaceUp);
        String dealerCardFaceDown = playGame("faceDown");
        //System.out.println("The Dealer's score is " + dealerScore + ".\n");
        String[] tab = new String[3];
        tab[0] = dealerCardFaceUp;
        tab[1] = dealerCardFaceDown;
        tab[2] = String.valueOf(dealerScore);
       
        return dealerScore;
    }
     public static int points (int score, String card) {

        int earnedPoints = 0;
        if ("Ace".equals(card) && score < 11) {

            System.out.println("Which value do you want to assign to your Ace: 1 or 11?");
            int aceAnswer = input.nextInt();
            switch (aceAnswer) {
                case 1:
                    earnedPoints = 1;
                    System.out.println("1 point is earned.");
                    break;
                case 11:
                    earnedPoints = 11;
                    System.out.println("11 points are earned.");
                    break;
                default:
                    System.out.println("Your answer is not valid! 11 points are earned.");
                    earnedPoints = 11;
                    break;
            }

        } else if ("10".equals(card) || "Jack".equals(card) || "Queen".equals(card) || "King".equals(card)) {

                earnedPoints = 10;
                System.out.println("10 points are earned.");
        } else if ("Ace".equals(card) && score >= 11) {

                earnedPoints = 1;
                System.out.println("1 point is earned.");
        } else {

            earnedPoints = Integer.parseInt(card);
            System.out.println(card + " points are earned.");
        }
        return earnedPoints;
    }
     public static String playGame (String face) {

        String cards[] = {"Ace","2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        Random r = new Random();
        int randomIndex = r.nextInt(13);
        String drawnCard = cards[randomIndex];
        if ("faceUp".equals(face)) {

            if ("Ace".equals(drawnCard)) {

                System.out.println("An Ace was drawn.");                               
            } else {

                System.out.println("A " + drawnCard + " was drawn.");
            }
        } else if ("faceDown".equals(face)) {

                System.out.println("A face-down card was drawn.");
            }        
        return drawnCard;  
    }
}

