package studio8;

import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class Quiz {
	
	private Question[] questions;
	
	/**
	 * Constructor
	 * @param questions
	 */
	public Quiz(Question[] questions) {
		this.questions = questions;
	}
	
	/**
	 * Prompts the user to answer, then returns a String containing their answer.
	 * @param in
	 * @return String answer
	 */
	private String getUserAnswer(Scanner in) {
		System.out.print("Please enter your answer: ");
		String out = in.next();
		return out;
	}
	
	/**
	 * Gets the number of points possible in the quiz.
	 * @return int number of total points
	 */
	public int getTotalPoints() {
		int sum = 0;
		for(int i=0;i<questions.length;i++) {
			sum = sum + questions[i].getPoints();
		}
		return sum;
	}
	
	/**
	 * Asks the user all question in the quiz, then prints out 
	 * the amount of points the user earned. This print statement
	 * should include "You earned ____ points"
	 * 
	 * @param in Scanner object to feed into getUserAnswer
	 */
	public void takeQuiz(Scanner in) {
		int total = 0;
		int earned = 0;
		for(int i=0;i<questions.length;i++) {
			questions[i].displayPrompt();
			System.out.println(questions[i].checkAnswer(getUserAnswer(in)));
			earned = earned + questions[i].checkAnswer(getUserAnswer(in));
			total = total + questions[i].getPoints();
			
		}
		System.out.println("You have earned "+earned+" points");
		System.out.println("Total points available were: "+total);
	}
	
	
	public static void main(String[] args) {
		// TODO: Make your own Quiz!
	}
}
