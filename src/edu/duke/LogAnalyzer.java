package edu.duke;
/**
 * Write a description of class LogAnalyzer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;

import edu.duke.*;

public class LogAnalyzer {
    private ArrayList<LogEntry> records;

    public LogAnalyzer() {

        records = new ArrayList<LogEntry>();
    }

    public void readFile(String filename) {
        // complete method
        FileResource resource = new FileResource(filename);
        for (String line : resource.lines()) {
            LogEntry logEntry = WebLogParser.parseEntry(line);
            records.add(logEntry);
        }
    }

    public void printAll() {
        for (LogEntry le : records) {
            System.out.println(le);
        }
    }

    public int countUniqueIPs() {

        ArrayList<String> uniqueIPList = new ArrayList<String>();
        for (LogEntry le : records){
            if(!uniqueIPList.contains(le.getIpAddress())){
                uniqueIPList.add(le.getIpAddress());
            }
        }
        return uniqueIPList.size();
    }

    public void printAllHigherThanNum(int num){
        System.out.println("***printAllHigherThanNum***");
        ArrayList<String> uniqueIPList = new ArrayList<String>();
        for (LogEntry le : records){
            if(num < le.getStatusCode()){
                System.out.println(le);
            }
        }
    }

    public ArrayList<String> uniqueIPVisitsOnDay(String someday){
        ArrayList<String> uniqueIPListDate = new ArrayList<String>();
        for (LogEntry le : records){
            if(!uniqueIPListDate.contains(le.getIpAddress())){

                String leDate = le.getAccessTime().toString();
//                System.out.println("Date:" + leDate);
                if(leDate.contains(someday)){

                    uniqueIPListDate.add(le.getIpAddress());
                }
            }
        }
        return uniqueIPListDate;
    }

    public int countUniqueIPsInRange(int low, int high){
        ArrayList<String> uniqueIPListRange = new ArrayList<String>();
        for (LogEntry le : records){
            if(!uniqueIPListRange.contains(le.getIpAddress())){

                if(le.getStatusCode() >= low && le.getStatusCode() <= high){

                    uniqueIPListRange.add(le.getIpAddress());
                }
            }
        }
        return uniqueIPListRange.size();

    }


}
