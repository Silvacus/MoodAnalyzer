package com.capgemini.Moodanalyser;


import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
    	MoodAnalyser moodObj = new MoodAnalyser("I am in Sad Mood");
    	String mood = moodObj.analyseMood();
    	Assert.assertEquals("Sad", mood);
    }
    
    @Test
    public void givenMessage_WhenOtherThanSad_ShouldReturnHappy() {
    	MoodAnalyser moodObj = new MoodAnalyser("I am in some Mood");
    	String mood = moodObj.analyseMood();
    	Assert.assertEquals("Happy", mood); 
    }
}
