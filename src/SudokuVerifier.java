
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		
		if(candidateSolution.length()!=81) return -5;
		
		Boolean[] checker = new Boolean[9];
		int currentNumber;
		
		// Checks if all rows are valid
		for(int i=0; i<81; i = i + 9){
			initializeChecker(checker);
			for(int j=i; j<i+9; j++){
				currentNumber = (int) candidateSolution.charAt(j) - '0';
				if(checker[currentNumber-1]==false) checker[currentNumber-1]=true;
				else return -3;
			}
		}
		
		//Checks if all columns are valid
		for(int i = 0; i < 9; i++){
			initializeChecker(checker);
		}
		
		// returns 0 if the candidate solution is correct
		return 0;
		
		//check
	}
	
	private void initializeChecker(Boolean[] checker){
		for(int i = 0; i<9; i++) checker[i]=false;
	}
}
