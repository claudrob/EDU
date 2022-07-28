package edu.duke;

import my.edu.oop.package1.A;
import my.edu.test.WordFrequencies;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class WordsInFiles {

    public static void main(String[] args) {
        System.out.println("Starting WordsInFiles");
        WordsInFiles wordsInFiles = new WordsInFiles();
        wordsInFiles.tester();
    }

    private HashMap<String, ArrayList<String>> wordMap;

    public WordsInFiles() {
        wordMap = new HashMap<String, ArrayList<String>>();
    }

    public void addWordsFromFile(File file) {
        String sourceFile = file.getAbsolutePath();
        System.out.println("addWordsFromFile() Reading data from sourceFile: " + sourceFile);
        System.out.println("file getName() = " + file.getName());
        System.out.println("file = AbsolutePath" + file.getAbsolutePath());
        System.out.println("file = Path" + file.getPath());

        FileResource resource = new FileResource(sourceFile);
        for (String line : resource.lines()) {
            String[] words = line.split(" ");
            for (String theWord : words) {
                if(theWord.trim().equals(""))
                    continue;

                if (wordMap.containsKey(theWord)) {
                    ArrayList<String> fileList = wordMap.get(theWord);
                    if(!fileList.contains(file.getName())) {
                        fileList.add(file.getName());
                    }
                    wordMap.put(theWord, fileList);

                } else {
                    ArrayList<String> fileList = new ArrayList<String>();
                    fileList.add(file.getName());
                    wordMap.put(theWord, fileList);
                }
            }


        }

    }

    public void buildWordFileMap() {
        wordMap.clear();
        DirectoryResource directoryResource = new DirectoryResource();
        Iterable<File> files = directoryResource.selectedFiles();
        for (File file : files) {
            addWordsFromFile(file);
        }


    }

    public int maxNumber() {
        int maxNumber = 0;
        for (String word : wordMap.keySet()){
            ArrayList<String> fileList = wordMap.get(word);
            if(fileList.size() > maxNumber){
                maxNumber = fileList.size();
            }

        }
            return maxNumber;
    }

    public ArrayList<String> wordsInNumFiles(int number) {
        ArrayList<String> wordsWithNumFiles = new ArrayList<String>();

        for (String word : wordMap.keySet()){
            ArrayList<String> fileList = wordMap.get(word);
            if(fileList.size() == number){
                wordsWithNumFiles.add(word);
            }
        }
        return wordsWithNumFiles;

    }

    public void printFilesIn(String word) {
        System.out.println("printFilesIn: " + word);
        ArrayList<String> fileList = this.wordMap.get(word);
        if (fileList != null){

            for (String fileName : fileList){
                System.out.println(fileName );
            }
        }
    }

    public void tester() {
        buildWordFileMap();
        int maxNumFiles = maxNumber();
//        ArrayList<String> maxWords = wordsInNumFiles(maxNumFiles);
//        for(String word : maxWords){
//            printFilesIn(word);
//        }

        System.out.println("Printing the number of words in 4 files ***");
        ArrayList<String> wordsIn5Files = wordsInNumFiles(4);
        System.out.println("Number of words in four files: " + wordsIn5Files.size());
//        for(String word : wordsIn5Files){
//            printFilesIn(word);
//        }
       printFilesIn("sad");
       printFilesIn("red");
       printFilesIn("sea");
       printFilesIn("tree");



    }

}
