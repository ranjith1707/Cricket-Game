package control;

import java.util.Arrays;

import model.TeamScore;
import repository.CricketDatabase;
import view.ScoreView;

public class ScoreAssignment {

	public void assignScore(String TeamName, int[] score, double[] balls) {
		
		CricketDatabase.getDb().getScore(TeamName).setPlayer1Score(score[0]);
		CricketDatabase.getDb().getScore(TeamName).setPlayer2Score(score[1]);
		CricketDatabase.getDb().getScore(TeamName).setPlayer3Score(score[2]);

       if(balls[0]!=0)
		CricketDatabase.getDb().getScore(TeamName).setPlayer1Strike((score[0] / balls[0]) * 100);
       if(balls[1]!=0)
		CricketDatabase.getDb().getScore(TeamName).setPlayer1Strike((score[1] / balls[1]) * 100);
       if(balls[2]!=0)
		CricketDatabase.getDb().getScore(TeamName).setPlayer1Strike((score[2] / balls[2]) * 100);
       
       
       return;
		
		

		
	}

}
