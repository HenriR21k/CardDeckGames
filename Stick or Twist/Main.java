import java.util.ArrayList;	  		 	       	       	   	 	
import java.util.Collections;	  		 	       	       	   	 	
import java.util.Scanner;	  		 	       	       	   	 	
	  		 	       	       	   	 	
public class Main	  		 	       	       	   	 	
{	  		 	       	       	   	 	
  public static void main(String[] args)	  		 	       	       	   	 	
  {	  		 	       	       	   	 	
    ArrayList <Card> cardDeck = new ArrayList();	  		 	       	       	   	 	
    Card heartAce = new Card("Heart", "Ace");	  		 	       	       	   	 	
    Card heartTwo = new Card ("Heart", "Two");	  		 	       	       	   	 	
    Card heartThree = new Card ("Heart", "Three");	  		 	       	       	   	 	
    Card heartFour = new Card ("Heart", "Four");	  		 	       	       	   	 	
    Card heartFive = new Card ("Heart", "Five");	  		 	       	       	   	 	
    Card heartSix = new Card ("Heart", "Six");	  		 	       	       	   	 	
    Card heartSeven = new Card ("Heart", "Seven");	  		 	       	       	   	 	
    Card heartEight = new Card ("Heart", "Eight");	  		 	       	       	   	 	
    Card heartNine = new Card ("Heart", "Nine");	  		 	       	       	   	 	
    Card heartTen = new Card ("Heart", "Ten");	  		 	       	       	   	 	
    Card heartJack = new Card ("Heart", "Jack");	  		 	       	       	   	 	
    Card heartQueen = new Card ("Heart", "Queen");	  		 	       	       	   	 	
    Card heartKing = new Card ("Heart", "King");	  		 	       	       	   	 	
    Card spadeAce = new Card("Spade", "Ace");	  		 	       	       	   	 	
    Card spadeTwo = new Card ("Spade", "Two");	  		 	       	       	   	 	
    Card spadeThree = new Card ("Spade", "Three");	  		 	       	       	   	 	
    Card spadeFour = new Card ("Spade", "Four");	  		 	       	       	   	 	
    Card spadeFive = new Card ("Spade", "Five");	  		 	       	       	   	 	
    Card spadeSix = new Card ("Spade", "Six");	  		 	       	       	   	 	
    Card spadeSeven = new Card ("Spade", "Seven");	  		 	       	       	   	 	
    Card spadeEight = new Card ("Spade", "Eight");	  		 	       	       	   	 	
    Card spadeNine = new Card ("Spade", "Nine");	  		 	       	       	   	 	
    Card spadeTen = new Card ("Spade", "Ten");	  		 	       	       	   	 	
    Card spadeJack = new Card ("Spade", "Jack");	  		 	       	       	   	 	
    Card spadeQueen = new Card ("Spade", "Queen");	  		 	       	       	   	 	
    Card spadeKing = new Card ("Space", "King");	  		 	       	       	   	 	
    Card diamondAce = new Card("Diamond", "Ace");	  		 	       	       	   	 	
    Card diamondTwo = new Card ("Diamond", "Two");	  		 	       	       	   	 	
    Card diamondThree = new Card ("Diamond", "Three");	  		 	       	       	   	 	
    Card diamondFour = new Card ("Diamond", "Four");	  		 	       	       	   	 	
    Card diamondFive = new Card ("Diamond", "Five");	  		 	       	       	   	 	
    Card diamondSix = new Card ("Diamond", "Six");	  		 	       	       	   	 	
    Card diamondSeven = new Card ("Diamond", "Seven");	  		 	       	       	   	 	
    Card diamondEight = new Card ("Diamond", "Eight");	  		 	       	       	   	 	
    Card diamondNine = new Card ("Diamond", "Nine");	  		 	       	       	   	 	
    Card diamondTen = new Card ("Diamond", "Ten");	  		 	       	       	   	 	
    Card diamondJack = new Card ("Diamond", "Jack");	  		 	       	       	   	 	
    Card diamondQueen = new Card ("Diamond", "Queen");	  		 	       	       	   	 	
    Card diamondKing = new Card ("Diamond", "King");	  		 	       	       	   	 	
    Card clubAce = new Card("Club", "Ace");	  		 	       	       	   	 	
    Card clubTwo = new Card ("Club", "Two");	  		 	       	       	   	 	
    Card clubThree = new Card ("Club", "Three");	  		 	       	       	   	 	
    Card clubFour = new Card ("Club", "Four");	  		 	       	       	   	 	
    Card clubFive = new Card ("Club", "Five");	  		 	       	       	   	 	
    Card clubSix = new Card ("Club", "Six");	  		 	       	       	   	 	
    Card clubSeven = new Card ("Club", "Seven");	  		 	       	       	   	 	
    Card clubEight = new Card ("Club", "Eight");	  		 	       	       	   	 	
    Card clubNine = new Card ("Club", "Nine");	  		 	       	       	   	 	
    Card clubTen = new Card ("Club", "Ten");	  		 	       	       	   	 	
    Card clubJack = new Card ("Club", "Jack");	  		 	       	       	   	 	
    Card clubQueen = new Card ("Club", "Queen");	  		 	       	       	   	 	
    Card clubKing = new Card ("Club", "King");	  		 	       	       	   	 	
    Collections.addAll(cardDeck,heartAce,heartTwo,heartThree,heartFour,heartFive,heartSix,heartSeven,heartEight,heartNine,heartTen,heartJack,heartQueen,heartKing,spadeAce,spadeTwo,spadeThree,spadeFour,spadeFive,spadeSix,spadeSeven,spadeEight,spadeNine,spadeTen,spadeJack,spadeQueen,spadeKing,diamondAce,diamondTwo,diamondThree,diamondFour,diamondFive,diamondSix,diamondSeven,diamondEight,diamondNine,diamondTen,diamondJack,diamondQueen,diamondKing,clubAce,clubTwo,clubThree,clubFour,clubFive,clubSix,clubSeven,clubEight,clubNine,clubTen,clubJack,clubQueen,clubKing);	  		 	       	       	   	 	
	  		 	       	       	   	 	
    Player player1 = new Player("Player 1");	  		 	       	       	   	 	
    ArrayList <Card> player1Hand = new ArrayList();	  		 	       	       	   	 	
    player1.setHand(player1Hand);	  		 	       	       	   	 	
	  		 	       	       	   	 	
    Player player2 = new Player("Player 2");	  		 	       	       	   	 	
    ArrayList <Card> player2Hand = new ArrayList();	  		 	       	       	   	 	
    player2.setHand(player2Hand);	  		 	       	       	   	 	
	  		 	       	       	   	 	
    Scanner myScanner = new Scanner(System.in);	  		 	       	       	   	 	
	  		 	       	       	   	 	
    int randomNumber = (int)(Math.random() * (cardDeck.size() - 0 + 1) + 0);	  		 	       	       	   	 	
    player1Hand.add(cardDeck.get(randomNumber));	  		 	       	       	   	 	
    System.out.println("xxxxxxxxxxxxxStarter Cardxxxxxxxxxxxxxx");	  		 	       	       	   	 	
    System.out.println(player1.getName()+", you drew the "+cardDeck.get(randomNumber).getFace()+" of "+cardDeck.get(randomNumber).getSuit()+"s");	  		 	       	       	   	 	
    player1.setScore(player1.getScore() + cardDeck.get(randomNumber).getValue());	  		 	       	       	   	 	
    System.out.println(player1.getName()+", your current score is "+player1.getScore());	  		 	       	       	   	 	
    System.out.println("");	  		 	       	       	   	 	
    Card oldCard;	  		 	       	       	   	 	
    Card newCard = cardDeck.get(randomNumber);	  		 	       	       	   	 	
    cardDeck.remove(randomNumber);	  		 	       	       	   	 	
	  		 	       	       	   	 	
    randomNumber = (int)(Math.random() * (cardDeck.size() - 0 + 1) + 0);	  		 	       	       	   	 	
    player2Hand.add(cardDeck.get(randomNumber));	  		 	       	       	   	 	
    System.out.println("xxxxxxxxxxxxxStarter Cardxxxxxxxxxxxxxx");	  		 	       	       	   	 	
    System.out.println(player2.getName()+", you drew the "+cardDeck.get(randomNumber).getFace()+" of "+cardDeck.get(randomNumber).getSuit()+"s");	  		 	       	       	   	 	
    player2.setScore(player2.getScore() + cardDeck.get(randomNumber).getValue());	  		 	       	       	   	 	
    System.out.println(player2.getName()+", your current score is "+player2.getScore());	  		 	       	       	   	 	
    System.out.println("");	  		 	       	       	   	 	
    oldCard = newCard;	  		 	       	       	   	 	
    newCard = cardDeck.get(randomNumber);	  		 	       	       	   	 	
    cardDeck.remove(randomNumber);	  		 	       	       	   	 	
	  		 	       	       	   	 	
    String playerResponse1;	  		 	       	       	   	 	
    String playerResponse2;	  		 	       	       	   	 	
	  		 	       	       	   	 	
    do	  		 	       	       	   	 	
    {	  		 	       	       	   	 	
      if (player1.isPlaying() == true)	  		 	       	       	   	 	
      {	  		 	       	       	   	 	
        System.out.println(player1.getName()+", stick or twist?");	  		 	       	       	   	 	
        do	  		 	       	       	   	 	
        {	  		 	       	       	   	 	
          playerResponse1 = myScanner.nextLine();	  		 	       	       	   	 	
          if (!playerResponse1.equalsIgnoreCase("STICK") && !playerResponse1.equalsIgnoreCase("TWIST"))	  		 	       	       	   	 	
            {	  		 	       	       	   	 	
              System.out.println("Sorry, please check your spelling and try again.");	  		 	       	       	   	 	
            }	  		 	       	       	   	 	
        } while (!playerResponse1.equalsIgnoreCase("STICK") && !playerResponse1.equalsIgnoreCase("TWIST"));	  		 	       	       	   	 	
        if (playerResponse1.equalsIgnoreCase("STICK"))	  		 	       	       	   	 	
        {	  		 	       	       	   	 	
          player1.setPlaying(false);	  		 	       	       	   	 	
        }	  		 	       	       	   	 	
        else if (playerResponse1.equalsIgnoreCase("TWIST"))	  		 	       	       	   	 	
        {	  		 	       	       	   	 	
          randomNumber = (int)(Math.random() * (cardDeck.size() - 0 + 1) + 0);	  		 	       	       	   	 	
          player1Hand.add(cardDeck.get(randomNumber));	  		 	       	       	   	 	
          System.out.println(player1.getName()+", you drew the "+cardDeck.get(randomNumber).getFace()+" of "+cardDeck.get(randomNumber).getSuit()+"s");	  		 	       	       	   	 	
          if (cardDeck.get(randomNumber).getFace().equals("Ace"))	  		 	       	       	   	 	
          {	  		 	       	       	   	 	
            if ((player1.getScore() + 11) > 21)	  		 	       	       	   	 	
            {	  		 	       	       	   	 	
              player1.setScore(player1.getScore() + 1);	  		 	       	       	   	 	
            }	  		 	       	       	   	 	
            else if ((player1.getScore() + 11) <= 21)	  		 	       	       	   	 	
            {	  		 	       	       	   	 	
              player1.setScore(player1.getScore() + 11);	  		 	       	       	   	 	
            }	  		 	       	       	   	 	
          }	  		 	       	       	   	 	
          else	  		 	       	       	   	 	
          {	  		 	       	       	   	 	
            player1.setScore(player1.getScore() + cardDeck.get(randomNumber).getValue());	  		 	       	       	   	 	
          }	  		 	       	       	   	 	
          if (player1.getScore() == 21)	  		 	       	       	   	 	
          {	  		 	       	       	   	 	
            System.out.println("");	  		 	       	       	   	 	
            System.out.println("xxxxxxxxxxxxxxxxxGAME ENDxxxxxxxxxxxxxxxxx");	  		 	       	       	   	 	
            System.out.println("Congratulations, you got exactly 21 points, player 2 wins!");	  		 	       	       	   	 	
            player1.setWinner(true);	  		 	       	       	   	 	
          }	  		 	       	       	   	 	
	  		 	       	       	   	 	
          System.out.println(player1.getName()+", your current score is "+player1.getScore());	  		 	       	       	   	 	
          System.out.println("");	  		 	       	       	   	 	
          oldCard = newCard;	  		 	       	       	   	 	
          newCard = cardDeck.get(randomNumber);	  		 	       	       	   	 	
          cardDeck.remove(randomNumber);	  		 	       	       	   	 	
        }	  		 	       	       	   	 	
       if (player1.getScore() > 21)	  		 	       	       	   	 	
        {	  		 	       	       	   	 	
          player1.setPlaying(false);	  		 	       	       	   	 	
          System.out.println("");	  		 	       	       	   	 	
          System.out.println("xxxxxxxxxxxxxxxxxGAME ENDxxxxxxxxxxxxxxxxx");	  		 	       	       	   	 	
          System.out.println("You have gone over 21, you have lost player 1");	  		 	       	       	   	 	
          player1.setWinner(false);	  		 	       	       	   	 	
        }	  		 	       	       	   	 	
      }	  		 	       	       	   	 	
	  		 	       	       	   	 	
      if (player2.isPlaying() == true)	  		 	       	       	   	 	
      {	  		 	       	       	   	 	
        System.out.println(player2.getName()+", stick or twist?");	  		 	       	       	   	 	
        do	  		 	       	       	   	 	
        {	  		 	       	       	   	 	
          playerResponse2 = myScanner.nextLine();	  		 	       	       	   	 	
          if (!playerResponse2.equalsIgnoreCase("STICK") && !playerResponse2.equalsIgnoreCase("TWIST"))	  		 	       	       	   	 	
            {	  		 	       	       	   	 	
              System.out.println("Sorry, please check your spelling and try again.");	  		 	       	       	   	 	
            }	  		 	       	       	   	 	
        } while (!playerResponse2.equalsIgnoreCase("STICK") && !playerResponse2.equalsIgnoreCase("TWIST"));	  		 	       	       	   	 	
        if (playerResponse2.equalsIgnoreCase("STICK"))	  		 	       	       	   	 	
        {	  		 	       	       	   	 	
          player2.setPlaying(false);	  		 	       	       	   	 	
        }	  		 	       	       	   	 	
        else if (playerResponse2.equalsIgnoreCase("TWIST"))	  		 	       	       	   	 	
        {	  		 	       	       	   	 	
          randomNumber = (int)(Math.random() * (cardDeck.size() - 0 + 1) + 0);	  		 	       	       	   	 	
          player2Hand.add(cardDeck.get(randomNumber));	  		 	       	       	   	 	
          System.out.println(player2.getName()+", you drew the "+cardDeck.get(randomNumber).getFace()+" of "+cardDeck.get(randomNumber).getSuit()+"s");	  		 	       	       	   	 	
          if (cardDeck.get(randomNumber).getFace().equals("Ace"))	  		 	       	       	   	 	
          {	  		 	       	       	   	 	
            if ((player2.getScore() + 11) > 21)	  		 	       	       	   	 	
            {	  		 	       	       	   	 	
              player2.setScore(player2.getScore() + 1);	  		 	       	       	   	 	
            }	  		 	       	       	   	 	
            else if ((player2.getScore() + 11) <= 21)	  		 	       	       	   	 	
            {	  		 	       	       	   	 	
              player1.setScore(player2.getScore() + 11);	  		 	       	       	   	 	
            }	  		 	       	       	   	 	
          }	  		 	       	       	   	 	
          else	  		 	       	       	   	 	
          {	  		 	       	       	   	 	
            player2.setScore(player2.getScore() + cardDeck.get(randomNumber).getValue());	  		 	       	       	   	 	
          }	  		 	       	       	   	 	
          if (player2.getScore() == 21)	  		 	       	       	   	 	
          {	  		 	       	       	   	 	
            System.out.println("");	  		 	       	       	   	 	
            System.out.println("xxxxxxxxxxxxxxxxxGAME ENDxxxxxxxxxxxxxxxxx");	  		 	       	       	   	 	
            System.out.println("Congratulations, you got exactly 21 points, player 2 wins!");	  		 	       	       	   	 	
            player2.setWinner(true);	  		 	       	       	   	 	
          }	  		 	       	       	   	 	
	  		 	       	       	   	 	
          System.out.println(player2.getName()+", your current score is "+player2.getScore());	  		 	       	       	   	 	
          System.out.println("");	  		 	       	       	   	 	
          oldCard = newCard;	  		 	       	       	   	 	
          newCard = cardDeck.get(randomNumber);	  		 	       	       	   	 	
          cardDeck.remove(randomNumber);	  		 	       	       	   	 	
        }	  		 	       	       	   	 	
        if (player2.getScore() > 21)	  		 	       	       	   	 	
        {	  		 	       	       	   	 	
          player2.setPlaying(false);	  		 	       	       	   	 	
          System.out.println("");	  		 	       	       	   	 	
          System.out.println("xxxxxxxxxxxxxxxxxGAME ENDxxxxxxxxxxxxxxxxx");	  		 	       	       	   	 	
          System.out.println("You have gone over 21, you have lost player 2");	  		 	       	       	   	 	
          player2.setWinner(false);	  		 	       	       	   	 	
        }	  		 	       	       	   	 	
      }	  		 	       	       	   	 	
      if (player1.isPlaying() == false && player2.isPlaying() == false)	  		 	       	       	   	 	
      {	  		 	       	       	   	 	
        if (player1.getScore() > 21 && player2.getScore() > 21)	  		 	       	       	   	 	
        {	  		 	       	       	   	 	
         System.out.println("");	  		 	       	       	   	 	
         System.out.println("xxxxxxxxxxxxxxxxxGAME ENDxxxxxxxxxxxxxxxxx");	  		 	       	       	   	 	
         System.out.println("You have both gone over 21, you both lose");	  		 	       	       	   	 	
         player1.setWinner(true);	  		 	       	       	   	 	
        }	  		 	       	       	   	 	
       else if (player1.getScore() > 21 && player2.getScore() < 21)	  		 	       	       	   	 	
       {	  		 	       	       	   	 	
         System.out.println("");	  		 	       	       	   	 	
         System.out.println("xxxxxxxxxxxxxxxxxGAME ENDxxxxxxxxxxxxxxxxx");	  		 	       	       	   	 	
         System.out.println("Well done player 2, you have won");	  		 	       	       	   	 	
         player2.setWinner(true);	  		 	       	       	   	 	
       }	  		 	       	       	   	 	
       else if (player1.getScore() < 21 && player2.getScore() > 21)	  		 	       	       	   	 	
       {	  		 	       	       	   	 	
         System.out.println("");	  		 	       	       	   	 	
         System.out.println("xxxxxxxxxxxxxxxxxGAME ENDxxxxxxxxxxxxxxxxx");	  		 	       	       	   	 	
         System.out.println("Well done player 1, you have won");	  		 	       	       	   	 	
       }	  		 	       	       	   	 	
       else if (player1.getScore() > player2.getScore())	  		 	       	       	   	 	
        {	  		 	       	       	   	 	
          System.out.println("");	  		 	       	       	   	 	
          System.out.println("xxxxxxxxxxxxxxxxxGAME ENDxxxxxxxxxxxxxxxxx");	  		 	       	       	   	 	
          System.out.println("Congratulations player 1, you have won!");	  		 	       	       	   	 	
          player1.setWinner(true);	  		 	       	       	   	 	
        }	  		 	       	       	   	 	
       else if (player1.getScore() < player2.getScore())	  		 	       	       	   	 	
        {	  		 	       	       	   	 	
         System.out.println("");	  		 	       	       	   	 	
         System.out.println("xxxxxxxxxxxxxxxxxGAME ENDxxxxxxxxxxxxxxxxx");	  		 	       	       	   	 	
         System.out.println("Congratulations player 2, you have won!");	  		 	       	       	   	 	
         player2.setWinner(true);	  		 	       	       	   	 	
        }	  		 	       	       	   	 	
       else if (player1.getScore() == player2.getScore())	  		 	       	       	   	 	
       {	  		 	       	       	   	 	
         System.out.println("");	  		 	       	       	   	 	
         System.out.println("xxxxxxxxxxxxxxxxxGAME ENDxxxxxxxxxxxxxxxxx");	  		 	       	       	   	 	
         System.out.print("Well you both have the same score, no one wins!");	  		 	       	       	   	 	
         player1.setWinner(true);	  		 	       	       	   	 	
       }	  		 	       	       	   	 	
       else if (player1.getScore() == 21)	  		 	       	       	   	 	
       {	  		 	       	       	   	 	
        System.out.println("");	  		 	       	       	   	 	
        System.out.println("xxxxxxxxxxxxxxxxxGAME ENDxxxxxxxxxxxxxxxxx");	  		 	       	       	   	 	
        System.out.println("Well done for scoring 21 points, player 1 wins!");	  		 	       	       	   	 	
        player1.setWinner(true);	  		 	       	       	   	 	
       }	  		 	       	       	   	 	
       else if (player2.getScore() == 21)	  		 	       	       	   	 	
       {	  		 	       	       	   	 	
         System.out.println("");	  		 	       	       	   	 	
         System.out.println("xxxxxxxxxxxxxxxxxGAME ENDxxxxxxxxxxxxxxxxx");	  		 	       	       	   	 	
         System.out.println("Well done for scoring 21 points, player 2 wins!");	  		 	       	       	   	 	
         player2.setWinner(true);	  		 	       	       	   	 	
       }	  		 	       	       	   	 	
      }	  		 	       	       	   	 	
	  		 	       	       	   	 	
    } while ((player1.isPlaying() == true || player2.isPlaying() == true) && player1.isWinner() == false && player2.isWinner() == false);	  		 	       	       	   	 	
	  		 	       	       	   	 	
	  		 	       	       	   	 	
  }	  		 	       	       	   	 	
}