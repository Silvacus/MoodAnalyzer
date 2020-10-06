package com.capgemini.Moodanalyser;


public class MoodAnalyser {
	private String message;
	
	public MoodAnalyser() {
		
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	public String analyseMood() {
		if(message.contains("I am in Sad Mood"))
			return "Sad";
		else
			return "Happy"; 
	}
	public static void main( String[] args ) {
		
	}
}
