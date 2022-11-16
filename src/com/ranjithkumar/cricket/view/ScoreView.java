package view;

import model.TeamScore;
import repository.CricketDatabase;

public class ScoreView {

	public void viewScore() {
		TeamScore team1 = CricketDatabase.getDb().getScore(CricketDatabase.getDb().getTeam1Name());
		TeamScore team2 = CricketDatabase.getDb().getScore(CricketDatabase.getDb().getTeam2Name());

		System.out.println("Team Name : " + CricketDatabase.getDb().getTeam1Name());
		System.out.println(CricketDatabase.getDb().getTeam(CricketDatabase.getDb().getTeam1Name()).getPlaye1Name()
				+ " : " + team1.getPlayer1Score() + "\n Strickrate: " + team1.getPlayer1Strike() + "\n "
				+ CricketDatabase.getDb().getTeam(CricketDatabase.getDb().getTeam1Name()).getPlayer2Name() + " : "
				+ team1.getPlayer2Score() + "\n Strickrate: " + team1.getPlayer2Strike() + "\n "
				+ CricketDatabase.getDb().getTeam(CricketDatabase.getDb().getTeam1Name()).getPlayer3Name() + " : "
				+ team1.getPlayer3Score() + "\n Strickrate: " + team1.getPlayer3Stricke() + "\n "
				+ "Wiket "+CricketDatabase.getDb().getTeam(CricketDatabase.getDb().getTeam1Name()).getBowler1Name()+" : "+CricketDatabase.getDb().getScore().get(CricketDatabase.getDb().getTeam1Name()).getBowler1Wicket()
				+ "\n"
				+"Wiket "+CricketDatabase.getDb().getTeam(CricketDatabase.getDb().getTeam1Name()).getBowler2Name()+" : "+ CricketDatabase.getDb().getScore().get(CricketDatabase.getDb().getTeam1Name()).getBowlet2Wicket());

		System.out.println("Team Name : " + CricketDatabase.getDb().getTeam2Name());

		System.out.println(CricketDatabase.getDb().getTeam(CricketDatabase.getDb().getTeam2Name()).getPlaye1Name()
				+ " : " + team2.getPlayer1Score() + "\n Strickrate: " + team2.getPlayer1Strike() + "\n "
				+ CricketDatabase.getDb().getTeam(CricketDatabase.getDb().getTeam2Name()).getPlayer2Name() + " : "
				+ team2.getPlayer2Score() + "\n Strickrate: " + team2.getPlayer2Strike() + "\n "
				+ CricketDatabase.getDb().getTeam(CricketDatabase.getDb().getTeam2Name()).getPlayer3Name() + " : "
				+ team2.getPlayer3Score() + "\n Strickrate: " + team2.getPlayer3Stricke()+ "\n "
						+"Wiket "+CricketDatabase.getDb().getTeam(CricketDatabase.getDb().getTeam2Name()).getBowler1Name()+" : "+ CricketDatabase.getDb().getScore().get(CricketDatabase.getDb().getTeam2Name()).getBowler1Wicket()
						+ "\n"
						+ "Wiket "+CricketDatabase.getDb().getTeam(CricketDatabase.getDb().getTeam2Name()).getBowler2Name()+" : "+CricketDatabase.getDb().getScore().get(CricketDatabase.getDb().getTeam2Name()).getBowlet2Wicket());
		// System.out.println()

	}
}
