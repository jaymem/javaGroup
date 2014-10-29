/**
 * Validation is made possible thanks to the methods that can be found here.
 */

/**
 * @author ethan duprey
 * @author jackson feist
 * @author jordan michael morenstein
 *
 */
public class Validation {
	/**
	 * Determines if the user input matches the correct answer for any question
	 * 
	 * @param userInput  what the user types for their answer
	 * @param answer  the correct answer that is returned from the quiz question
	 * @return
	 */
	public boolean checkAnswer(char userInput, char answer) {
		return userInput == answer;
	}
}
