package com.valtech.training.day5;

import java.util.Arrays;
import java.util.List;

public class CountOvalLetters {
	@SuppressWarnings("unused")
	private static class Word implements Comparable<Word>{
		private String actualWorld;
		private int vowelCount;
		private float ratio;
		
		@SuppressWarnings("unused")
		public Word(String word) {
			actualWorld = word;
			for(int i=0; i<word.length(); i++) {
				if("aeiouAEIOU".contains(""+word.charAt(i))) {
					vowelCount++;
				}
			}
			ratio = vowelCount * 1000 / word.length();
		}
		public int compareTo(Word other) {
			if(ratio != other.ratio) {
				if(actualWorld.length() == other.actualWorld.length())
					return actualWorld.length() - other.actualWorld.length();
			}
			if(ratio == other.ratio) {
				int length = actualWorld.length() > other.actualWorld.length() ? other.actualWorld.length() : actualWorld.length();
				for(int i =0; i < length; i++) {
//					if("aeiouAEIOU".equals("".+other.actualWorld.charAt(i))) {
//						
//					}
				}
			}
			return 0;
		}
		
	}

	public List<String> breakAndSort(String str){
			List<String> segments = Arrays.asList(str.split(" "));
			return segments;
	}
    public static void main(String[] args) {
    
}
    
}
