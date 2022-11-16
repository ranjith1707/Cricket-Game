package control;

import java.util.Arrays;

import repository.CricketDatabase;

public class ScoreBoard {
	int[] mark=new int[3];
	int[] mark2=new int[3];
	double[] team1Balls=new double[3];
	double[] team2Balls=new double[3];
     int team1Ballp1=0;
     int team2Ballp1=0;
     int team1Ballp2=0;
     int team2Ballp2=0;
	  int player1=0;
	  int player2=1;
	   boolean flag=false;
	public void team1Score(String score,int over) {
     String[] scoreBoard=score.split(",");
 // System.out.println(flag);
      for(int i=0; i<scoreBoard.length; i++) {
    
    	  if(scoreBoard[i].equals("W")) {
    		  
    		  if(over%2==0) {
        		  team1Ballp2+=1;
        	  }
        	  else {
        		  team1Ballp1+=1;
        	  }
    		  if(player1==0) {
    			  player1=2;
    		  }
    		  else if(player1==1) {
    			  player1=2;
    		  }
    		  
    	  }
    	 
    	//  System.out.println(player1);
    	//  System.out.println(player2);
    	  team1Balls[player1]= team1Balls[player1]+1;
    	  if( Character.isDigit(scoreBoard[i].charAt(0))) {
    		int  run=mark[player1];
    	    
    		mark[player1]=run+Character.getNumericValue(scoreBoard[i].charAt(0));
    		  
    		
    	  
    	  
    	  if(Character.getNumericValue(scoreBoard[i].charAt(0))%2!=0) {
    		   	 if(player1==0&&player2==1) {
    					  player1=1;
    					  player2=0;
    				  }
    				  else if(player1==1&&player2==0) {
    					 player1=0;
    					  player2=1;
    				  }
    		   	if(player1==1&&player2==2) {
    					  player1=2;
    					  player2=1;
    				  }
    				  else if(player1==2&&player2==1) {
    					 player1=1;
    					  player2=2;
    				  }
    		   	if(player1==0&&player2==2) {
    					  player1=2;
    					  player2=0;
    				  }
    				  else if(player1==2&&player2==0) {
    					 player1=0;
    					  player2=2;
    				  }
    		   	 
    	  }
    		   }
      }
     
    System.out.println(Arrays.toString(mark));
    flag=true;
    if(flag) {
    	
   	 if(player1==0&&player2==1) {
			  player1=1;
			  player2=0;
		  }
		  else if(player1==1&&player2==0) {
			 player1=0;
			  player2=1;
		  }
   	if(player1==1&&player2==2) {
			  player1=2;
			  player2=1;
		  }
		  else if(player1==2&&player2==1) {
			 player1=1;
			  player2=2;
		  }
   	if(player1==0&&player2==2) {
			  player1=2;
			  player2=0;
		  }
		  else if(player1==2&&player2==0) {
			 player1=0;
			  player2=2;
		  }
   	 
   	
   }
  flag=false;
   
    
	}
	public void team2Score(String data,int over) {
		  String[] scoreBoard=data.split(",");
		 // System.out.println(flag);
		      for(int i=0; i<scoreBoard.length; i++) {
		   
		    	  if(scoreBoard[i].equals("W")) {
		    		 
		    		  if(over%2==0) {
			    		  team2Ballp2+=1;
			    	  }
			    	  else {
			    		  team2Ballp1+=1;
			    	  }
		    		  if(player1==0) {
		    			  player1=2;
		    		  }
		    		  else if(player1==1) {
		    			  player1=2;
		    		  }
		    		  
		    	  }
		    	 // System.out.println(player1);
		    	 // System.out.println(player2);
		    	 
		    	  team2Balls[player1]= team2Balls[player1]+1;
		    	  if( Character.isDigit(scoreBoard[i].charAt(0))) {
		    		int  run=mark2[player1];
		    	    
		    		mark2[player1]=run+Character.getNumericValue(scoreBoard[i].charAt(0));
		    	
		    	  if(Character.getNumericValue(scoreBoard[i].charAt(0))%2!=0) {
		    		   	 if(player1==0&&player2==1) {
		    					  player1=1;
		    					  player2=0;
		    				  }
		    				  else if(player1==1&&player2==0) {
		    					 player1=0;
		    					  player2=1;
		    				  }
		    		   	if(player1==1&&player2==2) {
		    					  player1=2;
		    					  player2=1;
		    				  }
		    				  else if(player1==2&&player2==1) {
		    					 player1=1;
		    					  player2=2;
		    				  }
		    		   	if(player1==0&&player2==2) {
		    					  player1=2;
		    					  player2=0;
		    				  }
		    				  else if(player1==2&&player2==0) {
		    					 player1=0;
		    					  player2=2;
		    				  }
		    		   	 
		    	  }
		    		   }
		      }
		     
		  //  System.out.println(Arrays.toString(mark));
		    flag=true;
		    if(flag) {
		   	 if(player1==0&&player2==1) {
					  player1=1;
					  player2=0;
				  }
				  else if(player1==1&&player2==0) {
					 player1=0;
					  player2=1;
				  }
		   	if(player1==1&&player2==2) {
					  player1=2;
					  player2=1;
				  }
				  else if(player1==2&&player2==1) {
					 player1=1;
					  player2=2;
				  }
		   	if(player1==0&&player2==2) {
					  player1=2;
					  player2=0;
				  }
				  else if(player1==2&&player2==0) {
					 player1=0;
					  player2=2;
				  }
		   	 
		   	
		   }
		  flag=false;
	}
	
	public void assign() {
		ScoreAssignment scoreAssign=new ScoreAssignment();
		scoreAssign.assignScore(CricketDatabase.getDb().getTeam1Name(),mark,team1Balls);
		scoreAssign.assignScore(CricketDatabase.getDb().getTeam2Name(),mark2,team2Balls);
		CricketDatabase.getDb().getScore().get(CricketDatabase.getDb().getTeam1Name()).setBowler1Wicket(team2Ballp1);
		CricketDatabase.getDb().getScore().get(CricketDatabase.getDb().getTeam2Name()).setBowler1Wicket(team1Ballp1);
		CricketDatabase.getDb().getScore().get(CricketDatabase.getDb().getTeam1Name()).setBowlet2Wicket(team2Ballp2);
		CricketDatabase.getDb().getScore().get(CricketDatabase.getDb().getTeam2Name()).setBowlet2Wicket(team1Ballp2);
	}
}
