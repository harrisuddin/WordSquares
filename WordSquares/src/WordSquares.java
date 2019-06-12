public class WordSquares {

	public static boolean isWordSquare(String[] wsArray) {

		int rows;
		int columns;

		if (wsArray != null) {
			// if the array has one
			// element then it is a word square
			if (wsArray.length == 1) {
				System.out.println("True");
				return true;
			}
			rows = columns = wsArray.length;
		} else {
			System.out.println("Fail");
			return false;
		}

		for (int i = 0; i < rows; i++) {

			// if the length of the ith word in the array is more than
			// the length of the array then return false
			if (wsArray[i].length() > rows) {
				System.out.println("Fail");
				return false;
			}

			for (int j = 0; j < columns; j++) {

				// if the char at position j on string i is not equal to the 
				// char at position i on string j then this is not a word square
				if (wsArray[i].charAt(j) != wsArray[j].charAt(i)) {
					System.out.println("Fail");
					return false;
				}
			}
		}

		System.out.println("True");
		return true;

	}
	
	public static void main(String[] args) {

		String[] words = { "LADY", "AREA", "DEAR", "YARD" };
		isWordSquare(words);
	}
	
}
