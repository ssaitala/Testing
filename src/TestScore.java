
public class TestScore {
	
	Score[] scoreArr = new Score[5];
	
	public void doProcess()
	{
		scoreArr = prepareFactoryScores();
		print(scoreArr);
		
		// add more elements
		add(scoreArr, new Score(82, "Eighty Two"));
	}
	
	public void add(Score[] scoreArr, Score score) {
		int temp1 = 0;
		int temp2 = 0;
		boolean useTemp1 = false;
		boolean useTemp2 = false;
		
		if (score.getScore() > scoreArr[scoreArr.length - 1].getScore()) {
			for (Score currentScore : scoreArr) {
				if (score.getScore() > currentScore.getScore()) {
//						System.out.println("new score: "+score.getScore()+", existing score: "+currentScore.getScore());
					temp1 = currentScore.getScore();
					useTemp1 = true;
					
					break;
				}
			}
		}
	}
	
	
	public Score[] prepareFactoryScores()
	{
			scoreArr[0] = new Score(98, "Ninty Eight");
			scoreArr[1] = new Score(87, "Eighty Seven");
			scoreArr[2] = new Score(85, "Eighty Five");
			scoreArr[3] = new Score(63, "Sixty Three");
			scoreArr[4] = new Score(57, "Fifty Seven");
			
			return scoreArr;
	}
	
	public void print(Score[] scoreArr)
	{
		for(int i = 0; i < scoreArr.length; i++)
		{
			System.out.println(scoreArr[i]);
		}
	}

	public static void main(String[] args) {
		TestScore testScore = new TestScore();
		testScore.doProcess();
	}
}
