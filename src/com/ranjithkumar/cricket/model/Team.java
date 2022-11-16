package model;

public class Team {
	
		private String teamName;
	   private String player1Name;
	   private String player2Name;
	   private String player3Name;
	   private String bowler1Name;
	   private String bowler2Name;
	   
	   
	   public Team(String teamName,String player1Name,String player2Name,String player3Name,  String bowler1Name,String bowler2Name) {
		   this.teamName=teamName;
		   this. player1Name=player1Name;
		  this. player2Name=player2Name;
		  this. player3Name=player3Name;
		  this. bowler1Name=bowler1Name;
		  this. bowler2Name=bowler2Name;
		   
	   }
	public String getPlaye1Name() {
		return player1Name;
	}
	public void setPlaye1Name(String playe1Name) {
		this.player1Name = playe1Name;
	}
	public String getPlayer2Name() {
		return player2Name;
	}
	public void setPlayer2Name(String player2Name) {
		this.player2Name = player2Name;
	}
	public String getPlayer3Name() {
		return player3Name;
	}
	public void setPlayer3Name(String player3Name) {
		this.player3Name = player3Name;
	}
	public String getBowler1Name() {
		return bowler1Name;
	}
	public void setBowler1Name(String bowler1Name) {
		this.bowler1Name = bowler1Name;
	}
	public String getBowler2Name() {
		return bowler2Name;
	}
	public void setBowler2Name(String bowler2Name) {
		this.bowler2Name = bowler2Name;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	   
}