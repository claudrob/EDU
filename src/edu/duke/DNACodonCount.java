package edu.duke;

import java.util.HashMap;

public class DNACodonCount {
    private HashMap<String,Integer> codonMap;

    public static void main(String[] args) {
        DNACodonCount dnaCodonCount = new DNACodonCount();
//        dnaCodonCount.tester();
        dnaCodonCount.testerFromFile();
    }

    public DNACodonCount(){
        codonMap = new HashMap<String, Integer>();
    }

    public void buildCodonMap(int start, String dna){
        if(dna == null)
            return;

        for(int i = start; i < dna.length(); i = i + 3){
            if((i + 3) <= dna.length()){
                String codon = dna.substring(i, i + 3);
//                System.out.println("codon = " + codon);
                if(codonMap.containsKey(codon)){
                    codonMap.put(codon, codonMap.get(codon) + 1);
                }
                else {

                    codonMap.put(codon,  1);
                }
            }
        }
    }

    public String getMostCommonCodon(){
        String mostCommonCodon = "";
        int count = -1;

        for(String codon : this.codonMap.keySet()){
            if(codonMap.get(codon) > count){
                count = codonMap.get(codon);
                mostCommonCodon = codon;
            }
        }
        System.out.println("mostCommonCodon = " + mostCommonCodon);

        return mostCommonCodon;

    }

    public void printCodonCounts(int start, int end){
        System.out.println("\nprintCodonCounts: size = " + codonMap.size());
        for(String codon : this.codonMap.keySet()){
            if(this.codonMap.get(codon) >= start && this.codonMap.get(codon) <= end){
                System.out.println("codon = " + codon + " : " + this.codonMap.get(codon));
            }
        }
    }

    public void tester(){
        String source = "CGTTCAAGTTCAA";
        buildCodonMap(2, source.toUpperCase());
        printCodonCounts(1, 5);

    }

    public void testerFromFile(){
        String sourceFile = "data/dnaMystery2.txt";

        FileResource resource = new FileResource(sourceFile);

        for(String line : resource.lines()) {
            buildCodonMap(0, line.trim().toUpperCase());
        }
        printCodonCounts(7, 7);
        System.out.println("Most common codon: " + getMostCommonCodon());
    }

}
