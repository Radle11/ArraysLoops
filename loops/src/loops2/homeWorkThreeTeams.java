package loops2;

public class homeWorkThreeTeams {
	public static void main(String[] args) {
		/*ScoreBoard
		We have three team which are (A,B,C).
		Use for loop and give for each team scores.
		the output has to be:
		A team has 5 scores
		B team has 7 scores 
		C team has 3 scores

		A*****
		B*******
		C****/
		
		String stars="*";
		String result="";
		String aTeam ="A";
		int scoresATeam=5;
		for( int n=0; n<scoresATeam; n++ ) {
		result=result+stars;			
		}System.out.println(aTeam+result);
		
		String result2="";
		String bTeam="B";
		int scoresBTeam=7;
		for(int n=0; n<scoresBTeam; n++) {
			result2=result2+stars;
		}System.out.println(bTeam+result2);
		
		
		String result3="";
		String cTeam="B";
		int scoresCTeam=3;
		for(int n=0; n<scoresCTeam; n++) {
			result3=result3+stars;
		}System.out.println(cTeam+result3);
		
		
		
				
		
		
		
		

	}

}
