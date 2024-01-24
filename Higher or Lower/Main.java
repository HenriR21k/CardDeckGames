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
	  		    	         	   		 	
    Scanner myScanner = new Scanner(System.in);	  		    	         	   		 	
	  		    	         	   		 	
    /*Game 2: Higher or Lower*/	  		    	         	   		 	
	  		    	         	   		 	
    int randomNumber = (int)(Math.random() * (cardDeck.size() - 0 + 1) + 0);	  		    	         	   		 	
    player1Hand.add(cardDeck.get(randomNumber));	  		    	         	   		 	
    System.out.println("You drew the "+cardDeck.get(randomNumber).getFace()+" of "+cardDeck.get(randomNumber).getSuit()+"s");	  		    	         	   		 	
    Card oldCard;	  		    	         	   		 	
    Card newCard = cardDeck.get(randomNumber);	  		    	         	   		 	
    cardDeck.remove(randomNumber);	  		    	         	   		 	
	  		    	         	   		 	
    //do/while loop start - runs while (cardDeck.size() > 0 || player1.isPlaying() == true)	  		    	         	   		 	
	  		    	         	   		 	
    do	  		    	         	   		 	
    {	  		    	         	   		 	
      String prediction;	  		    	         	   		 	
      System.out.println("Higher or lower?");	  		    	         	   		 	
      do	  		    	         	   		 	
      {	  		    	         	   		 	
        prediction = myScanner.nextLine();	  		    	         	   		 	
        if (!prediction.equalsIgnoreCase("HIGHER") && !prediction.equalsIgnoreCase("LOWER"))	  		    	         	   		 	
          {	  		    	         	   		 	
            System.out.println("Sorry, please check your spelling and try again.");	  		    	         	   		 	
          }	  		    	         	   		 	
      } while (!prediction.equalsIgnoreCase("HIGHER") && !prediction.equalsIgnoreCase("LOWER"));	  		    	         	   		 	
	  		    	         	   		 	
      randomNumber = (int)(Math.random() * (cardDeck.size() - 0 + 1) + 0);	  		    	         	   		 	
      player1Hand.add(cardDeck.get(randomNumber));	  		    	         	   		 	
      System.out.println("You drew the "+cardDeck.get(randomNumber).getFace()+" of "+cardDeck.get(randomNumber).getSuit()+"s");	  		    	         	   		 	
      oldCard = newCard;	  		    	         	   		 	
      newCard = cardDeck.get(randomNumber);	  		    	         	   		 	
      cardDeck.remove(randomNumber);	  		    	         	   		 	
	  		    	         	   		 	
      if (newCard.getValue() == oldCard.getValue())	  		    	         	   		 	
      {	  		    	         	   		 	
        System.out.println("Sorry, it's a pair - you lose!");	  		    	         	   		 	
        player1.setPlaying(false);	  		    	         	   		 	
      }	  		    	         	   		 	
      else if (newCard.getFace().equals("Ace") || oldCard.getFace().equals("Ace"))	  		    	         	   		 	
      {	  		    	         	   		 	
        System.out.println("Congrats, you have an Ace so you get free a point!");	  		    	         	   		 	
        player1.setScore(player1.getScore() + 1);	  		    	         	   		 	
      }	  		    	         	   		 	
      else if ((prediction.equalsIgnoreCase("HIGHER") && newCard.getValue() > oldCard.getValue()) || (prediction.equalsIgnoreCase("LOWER") && newCard.getValue() < oldCard.getValue()))	  		    	         	   		 	
      {	  		    	         	   		 	
        System.out.println("Congrats, your prediction was correct!");	  		    	         	   		 	
        player1.setScore(player1.getScore() + 1);	  		    	         	   		 	
      }	  		    	         	   		 	
      else	  		    	         	   		 	
      {	  		    	         	   		 	
        System.out.println("Sorry, your prediction was incorrect - you lose!");	  		    	         	   		 	
        player1.setPlaying(false);	  		    	         	   		 	
      }	  		    	         	   		 	
	  		    	         	   		 	
    } while (cardDeck.size() > 0 && player1.isPlaying() == true);	  		    	         	   		 	
	  		    	         	   		 	
    System.out.println("You scored "+player1.getScore()+" points.");	  		    	         	   		 	
    System.out.println("Thank you for playing!");	  		    	         	   		 	
	  		    	         	   		 	
  }	  		    	         	   		 	
}