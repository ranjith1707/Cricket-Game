package control;
import java.io.*;
import java.util.Arrays;

import model.Team;
import model.TeamScore;
import repository.CricketDatabase;
import view.ScoreView;

public class DataCollection {
	ScoreBoard board=new ScoreBoard();
	
	public void dataRetrival() {
		File file=new File("E:\\Java\\CricketInput.txt");
		int seperator=1;
		int over=1;
		try {
			FileReader readFile=new FileReader(file);
			BufferedReader bRead=new BufferedReader(readFile);
			
            String data=bRead.readLine();
            String[] name = null;
			while(data!=null) {
				if(seperator==1)
				{
					
				 name=data.split(",");
				 
				 CricketDatabase.getDb().setTeam1Name(name[0]);
				 CricketDatabase.getDb().setTeam2Name(name[1]);
					}
				
			if(seperator==2) {
				String[] palyer=data.split(",");
				CricketDatabase.getDb().getTeam().put(name[0],new Team(name[0], palyer[0], palyer[1], palyer[2], palyer[3], palyer[4]));
				CricketDatabase.getDb().getScore().put(name[0],new TeamScore());
				
			}
			if(seperator==3) {
				String[] palyer=data.split(",");
				System.out.println(Arrays.toString(palyer));
				CricketDatabase.getDb().getTeam().put(name[1],new Team(name[1], palyer[0], palyer[1], palyer[2], palyer[3], palyer[4]));
				CricketDatabase.getDb().getScore().put(name[1],new TeamScore());
			}
			if(seperator>3&& seperator<8) {
				board.team1Score(data,over++);
			}
			
           if(seperator>=8) {
        	   if(seperator==8) {
        	   board.player1=0;
        	   board.player2=1;
        	   over=1;
        	   }
        	   
        	   board.team2Score(data,over++);
				
			}
           data=bRead.readLine();
           seperator++;
			}
			
		} catch ( IOException e) {
			
			e.printStackTrace();
		}
		
		board.assign();
		return;
	}
	
}
