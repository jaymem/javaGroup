/**
 * Where our question objects are instantiated and processed.
 * Menu output can also be found here.
 */

/**
 * @author ethan duprey
 * @autho jackson feist
 * @author jordan michael morenstein
 *
 */

public class Main {

	public static void main(String[] args) {
		
		
		// question one
		Quiz quiz1 = new Quiz();
		char questionOne = quiz1.questionOne();
		Question one = new Question(questionOne);
		one.userInput();
		one.answer();
		
		// question two
		Quiz quiz2 = new Quiz();
		char questionTwo = quiz2.questionTwo();
		Question two = new Question(questionTwo);
		two.userInput();
		two.answer();
		
		// question three
		Quiz quiz3 = new Quiz();
		char questionThree = quiz3.questionThree();
		Question three = new Question(questionThree);
		three.userInput();
		three.answer();
		
		// question four
		Quiz quiz4 = new Quiz();
		char questionFour = quiz4.questionFour();
		Question four = new Question(questionFour);
		four.userInput();
		four.answer();
		
		
		System.out.println("question one output----------- ");
		System.out.println("the total score is " + one.getScore());
		System.out.println("the total attempts is " + one.getAttempts());
		
		System.out.println("question two output----------- ");
		System.out.println("the total score for question two is " + two.getScore());
		System.out.println("the total attempts for question two is " + two.getAttempts());
		
		System.out.println("question three output----------- ");
		System.out.println("the total score is " + three.getScore());
		System.out.println("the total attempts is " + three.getAttempts());
		
		System.out.println("question four output----------- ");
		System.out.println("the total score for question two is " + four.getScore());
		System.out.println("the total attempts for question two is " + four.getAttempts());
		
		
	}

}
