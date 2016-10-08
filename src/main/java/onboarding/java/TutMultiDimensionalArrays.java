package onboarding.java;

public class TutMultiDimensionalArrays {
	public static void main(String[] args) {
		int[] value = { 3, 5, 2344 };
		System.out.println(value[2]);

		// [0][0] = 3, [0][1] = 6,[0][2]= 89 [1][0]=2, [1][1] = 4
		int[][] grip = { { 3, 6, 89 }, { 2, 4 }, { 1, 2, 3, 4 } };
		System.out.println(grip[1][1]);
		System.out.println(grip[0][2]);
		
		String[][] text = new String[2][3];
		text[0][1] = "Manchester United";
		System.out.println(text[0][1]);
		
		for (int row = 0; row < grip.length; row++) {
			for (int col = 0; col < grip[row].length; col++) {
				System.out.print(grip[row][col] + "\t");
			}
			System.out.println();
		}
		
		String[][] words = new String[2][];
		System.out.println(words[0]);
		
		words[0] = new String[3];
		words[0][2] = "hi there";
		System.out.println(words[0][2]);

	}

}
