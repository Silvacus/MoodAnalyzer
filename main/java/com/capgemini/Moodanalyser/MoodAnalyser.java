package com.capgemini.Moodanalyser;



public class MoodAnalyser {
	private String message;

	public MoodAnalyser() {

	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		try {
			if(message.contains("I am in Sad Mood"))
				return "Sad";
			else
				return "Happy"; 
		}catch(NullPointerException e) {
			return "Happy";
		}
	}
	public static void main( String[] args ) {

	}
}