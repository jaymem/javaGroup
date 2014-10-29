import java.util.Scanner;

/**
 * This class handles the creation and process for each question object
 * Methods to check answers, set/get scores and attempts live here
 */

/**
 * @author ethan duprey
 * @author jackson feist
 * @author jordan michael morenstein 
 *
 */
public class Question {
	Validation validate = new Validation();
	Scanner userInput = new Scanner(System.in);
	
	private int questionScore;
	private int questionAttempts;
	private char questionNumber;
	private char userAnswer; 
	private boolean answer; 
	private boolean wrongAnswer; 
	private boolean secondTry;
	
	/**
	 * Creates a new question object that represents a single question
	 * @param question  a question from the Quiz class
	 */
	public Question(char question) {
		this.questionNumber = question;
	}
	
	/**
	 * Receives the first character of the user's input
	 * Checks the answer that is provided by user with the correct answer
	 * that was passed as a parameter to our constructor function
	 * If the answer is false, numAttempts will trigger a second try
	 */
	public void userInput() {
		this.userAnswer = userInput.next().charAt(0); 
		this.answer = validate.checkAnswer(userAnswer, this.questionNumber);
		this.wrongAnswer = this.numAttempts(answer);
	}
	
	/**
	 * When a wrong answer is found, this method sets up a second attempt
	 * for the user. If the answer is not wrong, let it be known.
	 * @return false
	 */
	public boolean answer() {
		if (wrongAnswer) {
			userAnswer = userInput.next().charAt(0);
			answer = validate.checkAnswer(userAnswer, this.questionNumber);
			secondTry = this.secondTry(answer);
		}
		
		if (!wrongAnswer) 
			this.rightAnswer();
		
		return false;
	}
	
	/**
	 * Gets the users score for each question
	 * @return questionScore
	 */
	public int getScore() {
		return questionScore;
	}
	
	/**
	 * Increments the number of attempts that the user makes
	 */
	public void setAttempts() {
		this.questionAttempts += 1;
	}
	
	/**
	 * Gets the number of attempts user has made per question
	 * @return questionAttempts
	 */
	public int getAttempts() {
		return this.questionAttempts;
	}
	
	/**
	 * Depending if the answer that the user provided is true or false,
	 * this method will tally the score, being 25 pts for first attempt, 
	 * 15 pts for the second attempt
	 * @param correct  the users answer, true for correct false for inccorect
	 */
	public void tallyScore(boolean correct) {
		if (correct) { 
			this.questionScore += 25; 
			this.setAttempts(); 
		}
		else if(!correct)
			this.questionScore += 15;
	}
	
	/**
	 * When answer parameter is false, we set a second attempt and offer a second try
	 * 
	 * @param answer  the users answer, true for correct and false for incorrect
	 * @return 
	 */
	public boolean numAttempts(boolean answer) {
		if (!answer) {
			this.setAttempts();
			System.out.print("\nThat answer was incorrect, Please try again: ");
			return true;
		}
		
		return false;
	}
	
	/**
	 * Used when users need a second attempt. We set the second attempt,
	 * and then check if the answer is true. If its true on the second attempt,
	 * we let tallyScore know, and give them 15 pts for it.
	 * 
	 * @param answer  the users answer after it is validated with validate.checkAnswer
	 * @return
	 */
	public boolean secondTry(boolean answer) {
		this.setAttempts();
		
		if (answer)
			this.tallyScore(!answer);
		
		return false;
	}
	
	/**
	 * On every right answer, this method uses tallyScore to give the user 25pts
	 */
	public void rightAnswer() {
		this.tallyScore(true);
	}
}
