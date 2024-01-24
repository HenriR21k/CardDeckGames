import java.util.ArrayList;	  		 	       	       	   	 	
	  		 	       	       	   	 	
public class Player	  		 	       	       	   	 	
{	  		 	       	       	   	 	
  private String name;	  		 	       	       	   	 	
  private ArrayList hand;	  		 	       	       	   	 	
  private double score;	  		 	       	       	   	 	
  private boolean playing;	  		 	       	       	   	 	
  private boolean winner;	  		 	       	       	   	 	
	  		 	       	       	   	 	
  public Player (String n)	  		 	       	       	   	 	
  {	  		 	       	       	   	 	
    this.name = n;	  		 	       	       	   	 	
    this.score = 0;	  		 	       	       	   	 	
    this.playing = true;	  		 	       	       	   	 	
    this.winner = false;	  		 	       	       	   	 	
  }	  		 	       	       	   	 	
	  		 	       	       	   	 	
  public void setName(String name)	  		 	       	       	   	 	
  {	  		 	       	       	   	 	
     this.name = name;	  		 	       	       	   	 	
  }	  		 	       	       	   	 	
	  		 	       	       	   	 	
  public String getName()	  		 	       	       	   	 	
  {	  		 	       	       	   	 	
     return this.name;	  		 	       	       	   	 	
  }	  		 	       	       	   	 	
	  		 	       	       	   	 	
  public void setHand(ArrayList hand)	  		 	       	       	   	 	
  {	  		 	       	       	   	 	
     this.hand = hand;	  		 	       	       	   	 	
  }	  		 	       	       	   	 	
	  		 	       	       	   	 	
  public ArrayList getHand()	  		 	       	       	   	 	
  {	  		 	       	       	   	 	
     return this.hand;	  		 	       	       	   	 	
  }	  		 	       	       	   	 	
	  		 	       	       	   	 	
  public void setScore(double score)	  		 	       	       	   	 	
  {	  		 	       	       	   	 	
     this.score = score;	  		 	       	       	   	 	
  }	  		 	       	       	   	 	
	  		 	       	       	   	 	
  public double getScore()	  		 	       	       	   	 	
  {	  		 	       	       	   	 	
     return this.score;	  		 	       	       	   	 	
  }	  		 	       	       	   	 	
	  		 	       	       	   	 	
  public void setPlaying(boolean play)	  		 	       	       	   	 	
  {	  		 	       	       	   	 	
    this.playing = play;	  		 	       	       	   	 	
  }	  		 	       	       	   	 	
	  		 	       	       	   	 	
  public boolean isPlaying()	  		 	       	       	   	 	
  {	  		 	       	       	   	 	
    return this.playing;	  		 	       	       	   	 	
  }	  		 	       	       	   	 	
	  		 	       	       	   	 	
  public void setWinner(boolean winner)	  		 	       	       	   	 	
  {	  		 	       	       	   	 	
    this.winner = winner;	  		 	       	       	   	 	
  }	  		 	       	       	   	 	
	  		 	       	       	   	 	
  public boolean isWinner()	  		 	       	       	   	 	
  {	  		 	       	       	   	 	
    return this.winner;	  		 	       	       	   	 	
  }	  		 	       	       	   	 	
	  		 	       	       	   	 	
}