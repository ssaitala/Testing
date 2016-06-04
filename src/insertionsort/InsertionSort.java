package insertionsort;

import highestScoresDemo.Score;

public class InsertionSort {
	
	int[] unsortedArray = new int[5];
	
	private void makeSortedArray()
	{
		int i = 0;
		while(i < unsortedArray.length)
		{
			for(int j = i + 1; j < unsortedArray.length; j++)
			{
				if(unsortedArray[j] < unsortedArray[i])
				{
					int temp = unsortedArray[j];
					unsortedArray[i] = unsortedArray[j];
					unsortedArray[j] = temp;
				}
			}
		}
		print(unsortedArray);
		
	}
	
	public void print(int[] scoreArr) {
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.println(scoreArr[i]);
		}
	}
	
	public static void main(String[] args)
	{
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.makeSortedArray();
	}

}
