package highestScoresDemo;

public class TestScoreBetterApproach {
	
	static Score[] scoreArr = new Score[6];
	int numOfEntries;

	public void doProcess() {
		scoreArr = prepareFactoryScores();
		numOfEntries = scoreArr.length;
		
		print(scoreArr);
		
		System.out.println("*******************************************");
	}
	
	private void insertNewElement(Score score)
	{
		doInsertionLogic(score);
	}
	
	private void deleteElement(Score score)
	{
		int j = numOfEntries - 1;
		
		
		
		for( j = 0; j < scoreArr.length; j++)
		{
			if(scoreArr[j].getScore() == score.getScore())
			{
				while(j < scoreArr.length && j != scoreArr.length - 1)
				{
					scoreArr[j] = scoreArr[j + 1];
					j++;
				}
				scoreArr[j]= null;
			}
		}
	}
	
	private void doInsertionLogic(Score score)
	{
		int j = numOfEntries -1 ; // This will denote the top element of this array.
		
		while(j > 0 && scoreArr[j - 1].getScore() < score.getScore())
		{
			scoreArr[j] = scoreArr[j - 1];
			
			
			j--;
		}
		scoreArr[j] = score;
		
		
	}

	
	public Score[] prepareFactoryScores() {
		scoreArr[0] = new Score(98, "Ninty Eight");
		scoreArr[1] = new Score(87, "Eighty Seven");
		scoreArr[2] = new Score(85, "Eighty Five");
		scoreArr[3] = new Score(63, "Sixty Three");
		scoreArr[4] = new Score(57, "Fifty Seven");

		return scoreArr;
	}

	public static void print(Score[] scoreArr) {
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.println(scoreArr[i]);
		}
	}

	public static void main(String[] args) {
		TestScoreBetterApproach testScore = new TestScoreBetterApproach();
		testScore.doProcess();
		testScore.insertNewElement(new Score(59, "Fifty Nine"));
		testScore.insertNewElement(new Score(88, "Eighty Eight"));
		
		System.out.println("******************Before Deletion*************************");
		print(scoreArr);
		
		testScore.deleteElement(new Score(85, "Eighty Five"));
		
		System.out.println("*****************After Deletion***************************");
		print(scoreArr);
		
		testScore.insertNewElement(new Score(101, "one zero one"));
		System.out.println("*****************Again Insertion***************************");
		print(scoreArr);
		
	}
}
