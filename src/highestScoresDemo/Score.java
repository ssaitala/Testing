package highestScoresDemo;

public class Score {
	private int score;
	private String name;
	
	public Score(int score, String name)
	{
		this.score = score;
		this.name = name;
	}
	
	public int getScore()
	{
		return score;
	}
	
	public String name()
	{
		return name;
	}
	
	public String toString()
	{
		return score+", "+name;
	}
}
