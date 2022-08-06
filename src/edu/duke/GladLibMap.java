package edu.duke;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class GladLibMap {

	private ArrayList<String> usedList;
	private HashMap<String, ArrayList<String>> myMap;
	private ArrayList<String> usedCategories;

//	private ArrayList<String> adjectiveList;
//	private ArrayList<String> nounList;
//	private ArrayList<String> colorList;
//	private ArrayList<String> countryList;
//	private ArrayList<String> nameList;
//	private ArrayList<String> animalList;
//	private ArrayList<String> timeList;
//	private ArrayList<String> verbList;
//	private ArrayList<String> fruitList;

	private Random myRandom;

	private static String dataSourceURL = "http://dukelearntoprogram.com/course3/data";
	private static String dataSourceDirectory = "data";

	public static void main(String[] args) {

		System.out.println("Starting GladlabMap");
		GladLibMap gladLib = new GladLibMap();
		System.out.println("makeStory");
		gladLib.makeStory();
	}

	public GladLibMap(){

		myMap = new HashMap<String, ArrayList<String>>();
		initializeFromSource(dataSourceDirectory);

		myRandom = new Random();
		usedList = new ArrayList<String>();
		usedCategories = new ArrayList<String>();

	}

	public GladLibMap(String source){
		initializeFromSource(source);
		myRandom = new Random();
		usedList = new ArrayList<String>();
	}
	
	private void initializeFromSource(String source) {

		String [] categories = {"adjective", "noun", "color" , "country", "name", "animal",
			"timeframe", "verb", "fruit"};

		for (String category : categories){
			ArrayList<String>  wordList = readIt(source + "/" + category + ".txt");
			myMap.put(category, wordList );
		}

//		adjectiveList= readIt(source+"/adjective.txt");
//		nounList = readIt(source+"/noun.txt");
//		colorList = readIt(source+"/color.txt");
//		countryList = readIt(source+"/country.txt");
//		nameList = readIt(source+"/name.txt");
//		animalList = readIt(source+"/animal.txt");
//		timeList = readIt(source+"/timeframe.txt");
//		verbList = readIt(source+"/verb.txt");
//		fruitList = readIt(source+"/fruit.txt");

	}
	
	private String randomFrom(ArrayList<String> source){
		int index = myRandom.nextInt(source.size());
		return source.get(index);
	}
	
	private String getSubstitute(String label) {
		System.out.println("getSubstitute(): label = " + label);
		ArrayList<String> wordList = myMap.get(label);
		if (wordList == null)
			return "**UNKNOWN**";
		if(!usedCategories.contains(label)) {
			usedCategories.add(label);
		}
		String substitute =  randomFrom(wordList);
		if(substitute != null)
			return substitute;
		return "**UNKNOWN**";

//		if (label.equals("country")) {
//			return randomFrom(countryList);
//		}
//		if (label.equals("color")){
//			return randomFrom(colorList);
//		}
//		if (label.equals("noun")){
//			return randomFrom(nounList);
//		}
//		if (label.equals("name")){
//			return randomFrom(nameList);
//		}
//		if (label.equals("adjective")){
//			return randomFrom(adjectiveList);
//		}
//		if (label.equals("animal")){
//			return randomFrom(animalList);
//		}
//		if (label.equals("timeframe")){
//			return randomFrom(timeList);
//		}
//		if (label.equals("number")){
//			return ""+myRandom.nextInt(50)+5;
//		}
//		if (label.equals("verb")){
//			return ""+myRandom.nextInt(50)+5;
//		}
//		if (label.equals("fruit")){
//			return ""+myRandom.nextInt(50)+5;
//		}

	}
	
	private String processWord(String w){
		int first = w.indexOf("<");
		int last = w.indexOf(">",first);
		if (first == -1 || last == -1){
			return w;
		}
		String prefix = w.substring(0,first);
		String suffix = w.substring(last+1);
		String sub = getSubstitute(w.substring(first+1,last));
		if(usedList.contains(sub)){
			// use another word

			System.out.println("ProcessWord that was already used: sub = " + sub);
			sub = getSubstitute(w.substring(first+1,last));
		}
		else{
			usedList.add(sub);
		}

		return prefix+sub+suffix;
	}
	
	private void printOut(String s, int lineWidth){
		int charsWritten = 0;
		for(String w : s.split("\\s+")){
			if (charsWritten + w.length() > lineWidth){
				System.out.println();
				charsWritten = 0;
			}
			System.out.print(w+" ");
			charsWritten += w.length() + 1;
		}
	}
	
	private String fromTemplate(String source){
		String story = "";
		if (source.startsWith("http")) {
			URLResource resource = new URLResource(source);
			for(String word : resource.words()){
				story = story + processWord(word) + " ";
			}
		}
		else {
			FileResource resource = new FileResource(source);
			for(String word : resource.words()){
				story = story + processWord(word) + " ";
			}
		}
		return story;
	}
	
	private ArrayList<String> readIt(String source){
		ArrayList<String> list = new ArrayList<String>();
		if (source.startsWith("http")) {
			URLResource resource = new URLResource(source);
			for(String line : resource.lines()){
				list.add(line);
			}
		}
		else {
			FileResource resource = new FileResource(source);
			for(String line : resource.lines()){
				list.add(line);
			}
		}
		return list;
	}

	public int totalWordsInMap(){
		int totalWords = 0;
		for(String category : myMap.keySet()){
			ArrayList<String> wordList = myMap.get(category);
			totalWords = totalWords + wordList.size();
		}
		return totalWords;
	}


	public int totalWordsConsidered(){
		int totalWords = 0;

		for (String category : usedCategories){
			ArrayList<String> wordList = myMap.get(category);
			totalWords = totalWords + wordList.size();
		}
		return totalWords;
	}

	public void makeStory(){
	    System.out.println("\n");
		String story = fromTemplate("data/madtemplate2.txt");
		printOut(story, 60);
		//TODO: Print total of used words
		System.out.println("\n\nNumber of words replaced: " + usedList.size());
		System.out.println("Total words to pick from: " + totalWordsInMap());
		System.out.println("Total words Considered: " + totalWordsConsidered());

	}
	


}
