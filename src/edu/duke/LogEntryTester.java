package edu.duke;
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class LogEntryTester
{

    public static void main(String[] args) {
        LogEntryTester logEntryTester = new LogEntryTester();
//        logEntryTester.testLogEntry();
//        logEntryTester.testLogAnalyzer();
        logEntryTester.testLogAnalyzerIPs();
    }

    public void testLogEntry() {
        LogEntry le = new LogEntry("1.2.3.4", new Date(), "example request", 200, 500);
        System.out.println(le);
        LogEntry le2 = new LogEntry("1.2.100.4", new Date(), "example request 2", 300, 400);
        System.out.println(le2);
    }
    
    public void testLogAnalyzer() {
        LogAnalyzer logAnalyzer = new LogAnalyzer();
//        logAnalyzer.readFile("data/weblog-short_log");
        logAnalyzer.readFile("data/weblog2_log");

//        logAnalyzer.printAll();
        System.out.println("Unique IPs: " + logAnalyzer.countUniqueIPs());
        System.out.println("*** printAllHigherThanNum(400) ***");
        logAnalyzer.printAllHigherThanNum(400);
        System.out.println("Test on day: Sep 27");
        ArrayList<String> result = logAnalyzer.uniqueIPVisitsOnDay("Sep 27");
        System.out.println("result.size for Sep 27 = " + result.size());
        printOutArrayList(result);

        result.clear();
        System.out.println("Test on day: Sep 30");

        result = logAnalyzer.uniqueIPVisitsOnDay("Mar 17");
        System.out.println("*** uniqueIPVisitsOnDay(Mar 17) ***: " + result.size() );


        printOutArrayList(result);

        System.out.println("countUniqueIPsInRange(200,299): " + logAnalyzer.countUniqueIPsInRange(200,299));
        System.out.println("countUniqueIPsInRange(300,399): " + logAnalyzer.countUniqueIPsInRange(300,399));
    }
    
    private void printOutArrayList(ArrayList<String> ar){
        for (String s : ar){
            System.out.println("s = " + s);
        }
    }


    public void testLogAnalyzerIPs() {
        LogAnalyzer logAnalyzer = new LogAnalyzer();
//        logAnalyzer.readFile("data/weblog3-short_log");
        logAnalyzer.readFile("data/weblog2_log");
        HashMap<String, Integer> resultHM = logAnalyzer.countVisitsPerIP();
        System.out.println("resultHM = " + resultHM);
        int mostNumberVisitsByIP = logAnalyzer.mostNumberVisitsByIP(resultHM);
        System.out.println("mostNumberVisitsByIP = " + mostNumberVisitsByIP);

        ArrayList<String> popularIp = logAnalyzer.iPsMostVisits(resultHM);
        System.out.println("popularIp = " + popularIp);

        HashMap<String, ArrayList<String>> iPsForDaysMap = logAnalyzer.iPsForDays();
        System.out.println("iPsForDaysMap = " + iPsForDaysMap);
        System.out.println("dayWithMostIPVisits = " + logAnalyzer.dayWithMostIPVisits(iPsForDaysMap));

        System.out.println("*******");
        ArrayList<String> ipResultAL = logAnalyzer.iPsWithMostVisitsOnDay(iPsForDaysMap, "Sep 30");
        System.out.println("iPsWithMostVisitsOnDay = " + ipResultAL);


    }

}
