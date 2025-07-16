public class TwoSpinners{
 	/** Precondition: min < max
  	*/
 	/*The spin method simulates a spin of a fair spinner.
  	* The method returns a random integer between min and max,
  	* inclusive. Complete the spin method below by assigning
  	* this random integer to result.
  	*/
 	public int spin(int min, int max)
 	{
     	    int result=0;
     	    result=(int)((Math.random()*(max-min+1))+min);
    	    return result;
 	}

 	/** Simulates one round of the game as described in part (b).
  	*/
 	public void playRound()
 	{
   	    int computer= spin(2,8);
        int player= spin(1,10);
        int round=player-computer;
        if(computer>player){
            System.out.println("You lose. "+round+" Points");
        }
        if(player>computer){
            System.out.println("You Win! "+round+" Points");
        }
        if(player==computer){
            int computer1= spin(2,8);
            int player1= spin(1,10);
                if(computer1>player1) System.out.println("You lose. "+-1+" Points");
                else if(player1>computer1) System.out.println("You Win! "+1+" Points");
                else System.out.println("Tie. "+0+" Points");
                


        }
	}

 	public static void main(String[] args) {
     	  TwoSpinners ds = new TwoSpinners();
     	      for(int i = 0; i < 10; i++){    //This will save you time by running playground 10 times
         		ds.playRound();
     	      }
 	  }

 }
 
