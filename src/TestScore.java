
public class TestScore {

	Score[] scoreArr = new Score[5];

	public void doProcess() {
		scoreArr = prepareFactoryScores();
		print(scoreArr);

		// add more elements
		add(scoreArr, new Score(97, "Ninty Seven"));
		System.out.println("************************************");
		print(scoreArr);
	}

	public void add(Score[] scoreArr, Score score) {
		Score temp1 = null;
		Score temp2 = null;
		boolean useTemp1 = false;
		boolean useTemp2 = false;

		if (score.getScore() > scoreArr[scoreArr.length - 1].getScore()) {
			int i = 0;
			for (Score currentScore : scoreArr) {
				if (score.getScore() > currentScore.getScore()) {

					if (temp1 == null) {
						temp1 = currentScore;
						scoreArr[i] = score;
						useTemp1 = true;
						useTemp2 = false;
					} else {
						if (useTemp1) {
							temp2 = scoreArr[i];
							scoreArr[i] = temp1;

							useTemp1 = false;
							useTemp2 = true;
						}

						else if (useTemp2) {
							temp1 = scoreArr[i];
							scoreArr[i] = temp2;

							useTemp1 = true;
							useTemp2 = false;
						}
					}

				}
				i++;
			}
		}
	}

	public Score[] prepareFactoryScores() {
		scoreArr[0] = new Score(98, "Ninty Eight");
		scoreArr[1] = new Score(87, "Eighty Seven");
		scoreArr[2] = new Score(85, "Eighty Five");
		scoreArr[3] = new Score(63, "Sixty Three");
		scoreArr[4] = new Score(57, "Fifty Seven");

		return scoreArr;
	}

	public void print(Score[] scoreArr) {
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.println(scoreArr[i]);
		}
	}

	public static void main(String[] args) {
		TestScore testScore = new TestScore();
		testScore.doProcess();
	}
}
