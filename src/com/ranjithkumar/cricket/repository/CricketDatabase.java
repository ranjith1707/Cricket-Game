package repository;

import java.util.HashMap;

import model.Team;
import model.TeamScore;

public class CricketDatabase {
   
	static private CricketDatabase db;
	private String Team1Name;
	private String Team2Name;
	private HashMap<String,Team> teams;
	private HashMap<String,TeamScore> teamScore;
	
	private CricketDatabase() {
		teams=new HashMap();
		teamScore=new HashMap();
	}
	
	
	
	public static CricketDatabase getDb() {
		if(db==null) {
			db=new CricketDatabase();
		}
		return db;
	}
	
	
	public  HashMap<String,Team> getTeam(){
		return teams;
		
	}
	public HashMap<String,TeamScore> getScore(){
		return teamScore;
		
	}
	public Team getTeam(String teamName){
		return teams.get(teamName);
		
	}
	public TeamScore getScore(String teamName){
		return teamScore.get(teamName);
		
	}



	public String getTeam1Name() {
		return Team1Name;
	}



	public void setTeam1Name(String team1Name) {
		Team1Name = team1Name;
	}



	public String getTeam2Name() {
		return Team2Name;
	}



	public void setTeam2Name(String team2Name) {
		Team2Name = team2Name;
	}
	
	
}
