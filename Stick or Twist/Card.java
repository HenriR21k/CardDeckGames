public class Card	  		 	       	       	   	 	
{	  		 	       	       	   	 	
  private String suit;	  		 	       	       	   	 	
  private String face;	  		 	       	       	   	 	
  private double value;	  		 	       	       	   	 	
	  		 	       	       	   	 	
  public Card(String s, String f)	  		 	       	       	   	 	
  {	  		 	       	       	   	 	
    this.suit = s;	  		 	       	       	   	 	
    this.face = f;	  		 	       	       	   	 	
    if (f.equals("Ace"))	  		 	       	       	   	 	
    {	  		 	       	       	   	 	
      this.value = 1;	  		 	       	       	   	 	
    }	  		 	       	       	   	 	
    else if (f.equals("Two"))	  		 	       	       	   	 	
    {	  		 	       	       	   	 	
      this.value = 2;	  		 	       	       	   	 	
    }	  		 	       	       	   	 	
    else if (f.equals("Three"))	  		 	       	       	   	 	
    {	  		 	       	       	   	 	
      this.value = 3;	  		 	       	       	   	 	
    }	  		 	       	       	   	 	
    else if (f.equals("Four"))	  		 	       	       	   	 	
    {	  		 	       	       	   	 	
      this.value = 4;	  		 	       	       	   	 	
    }	  		 	       	       	   	 	
    else if (f.equals("Five"))	  		 	       	       	   	 	
    {	  		 	       	       	   	 	
      this.value = 5;	  		 	       	       	   	 	
    }	  		 	       	       	   	 	
    else if (f.equals("Six"))	  		 	       	       	   	 	
    {	  		 	       	       	   	 	
      this.value = 6;	  		 	       	       	   	 	
    }	  		 	       	       	   	 	
    else if (f.equals("Seven"))	  		 	       	       	   	 	
    {	  		 	       	       	   	 	
      this.value = 7;	  		 	       	       	   	 	
    }	  		 	       	       	   	 	
    else if (f.equals("Eight"))	  		 	       	       	   	 	
    {	  		 	       	       	   	 	
      this.value = 8;	  		 	       	       	   	 	
    }	  		 	       	       	   	 	
    else if (f.equals("Nine"))	  		 	       	       	   	 	
    {	  		 	       	       	   	 	
      this.value = 9;	  		 	       	       	   	 	
    }	  		 	       	       	   	 	
    else if (f.equals("Ten") || f.equals("Jack") || f.equals("Queen") || f.equals("King"))	  		 	       	       	   	 	
    {	  		 	       	       	   	 	
      this.value = 10;	  		 	       	       	   	 	
    }	  		 	       	       	   	 	
  }	  		 	       	       	   	 	
	  		 	       	       	   	 	
  public void setSuit(String suit)	  		 	       	       	   	 	
  {	  		 	       	       	   	 	
     this.suit = suit;	  		 	       	       	   	 	
  }	  		 	       	       	   	 	
	  		 	       	       	   	 	
  public String getSuit()	  		 	       	       	   	 	
  {	  		 	       	       	   	 	
     return this.suit;	  		 	       	       	   	 	
  }	  		 	       	       	   	 	
	  		 	       	       	   	 	
  public void setFace(String face)	  		 	       	       	   	 	
  {	  		 	       	       	   	 	
     this.face = face;	  		 	       	       	   	 	
  }	  		 	       	       	   	 	
	  		 	       	       	   	 	
  public String getFace()	  		 	       	       	   	 	
  {	  		 	       	       	   	 	
     return this.face;	  		 	       	       	   	 	
  }	  		 	       	       	   	 	
	  		 	       	       	   	 	
  public void setValue(double value)	  		 	       	       	   	 	
  {	  		 	       	       	   	 	
     this.value = value;	  		 	       	       	   	 	
  }	  		 	       	       	   	 	
	  		 	       	       	   	 	
  public double getValue()	  		 	       	       	   	 	
  {	  		 	       	       	   	 	
     return this.value;	  		 	       	       	   	 	
  }	  		 	       	       	   	 	
	  		 	       	       	   	 	
}