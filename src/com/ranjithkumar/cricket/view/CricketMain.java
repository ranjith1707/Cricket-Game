package view;

import control.DataCollection;

public class CricketMain {

	public static void main(String[] args) {
		CricketMain c=new CricketMain();
		c.init();
	}
	
	
	
	private void  init() {
		System.out.println("Welcome to World Cricet ");
		DataCollection d=new DataCollection();
		ScoreView v=new ScoreView();
		d.dataRetrival();
		v.viewScore();
		
	}
	
}
