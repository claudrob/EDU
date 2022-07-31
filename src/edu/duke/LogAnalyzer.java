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


    public HashMap<String, Integer> countVisitsPerIP(){

        HashMap<String, Integer> visitsPerIPHashMap = new HashMap<String, Integer>();

        for (LogEntry le : records){
            if(!visitsPerIPHashMap.containsKey(le.getIpAddress())){

                visitsPerIPHashMap.put(le.getIpAddress(), 1);

            }
            else {
                visitsPerIPHashMap.put(le.getIpAddress(), visitsPerIPHashMap.get(le.getIpAddress()) + 1);
            }
        }
        return visitsPerIPHashMap;

    }

    public int mostNumberVisitsByIP(HashMap<String, Integer> visitsPerIPHM){
        int maxVisits = -1;
        for (String ip : visitsPerIPHM.keySet()){
            int numberVisits = visitsPerIPHM.get(ip);
            if(numberVisits > maxVisits){
                maxVisits = numberVisits;
            }
        }
        return maxVisits;
    }

    public ArrayList<String> iPsMostVisits(HashMap<String, Integer> visitsPerIpHM){
        ArrayList<String> iPsResult = new ArrayList<String>();
        int mostVisitedNumber = mostNumberVisitsByIP(visitsPerIpHM);
        for (String ip : visitsPerIpHM.keySet()){
            if(mostVisitedNumber == visitsPerIpHM.get(ip)){
                iPsResult.add(ip);
            }
        }

        return iPsResult;
    }

    public HashMap<String, ArrayList<String>> iPsForDays(){
        HashMap<String, ArrayList<String>>  result = new HashMap<String, ArrayList <String>>();

        for(LogEntry le : this.records){
            Date date = le.getAccessTime();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int month = calendar.get(Calendar.MONTH);
            int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
            String strDate = getMonth(month) + " " + dayOfMonth;

            if(result.containsKey(strDate)){
                ArrayList<String> ipList = result.get(strDate);
                ipList.add(le.getIpAddress());
                result.put(strDate, ipList);
            }
            else {
                ArrayList<String> ipList = new ArrayList<String>();
                ipList.add(le.getIpAddress());
                result.put(strDate, ipList);


            }

        }

        return result;
    }

    public String dayWithMostIPVisits(HashMap<String, ArrayList<String>>   visitsPerDateHM){
        String dayResult = "";
        int maxIPs = -1;


        for (String date : visitsPerDateHM.keySet()){

            ArrayList<String> ipList = visitsPerDateHM.get(date);

            if(maxIPs < ipList.size()){
                dayResult = date;
                maxIPs = ipList.size();
            }
        }

        return dayResult;
    }


    private String getMonth(int month){
        String date = "";

        switch(month){
            case 0: date = "Jan"; break;
            case 1: date = "Feb"; break;
            case 2: date = "Mar"; break;
            case 3: date = "Apr"; break;
            case 4: date = "May"; break;
            case 5: date = "Jun"; break;
            case 6: date = "Jul"; break;
            case 7: date = "Aug"; break;
            case 8: date = "Sep"; break;
            case 9: date = "Oct"; break;
            case 10: date = "Nov"; break;
            case 11: date = "Dec"; break;
            default: date = "Unknown";
        }

        return date;
    }

    public ArrayList<String> iPsWithMostVisitsOnDay(HashMap<String, ArrayList<String>> ipForDays, String date){
        ArrayList<String> ipResultAL = new ArrayList<String>();

        HashMap<String, Integer> visitsPerIPPerDay = countVisitsPerIPForDay(date);
        ipResultAL = iPsMostVisits(visitsPerIPPerDay);

        return ipResultAL;

    }

    public HashMap<String, Integer> countVisitsPerIPForDay(String date){

        HashMap<String, Integer> visitsPerIPHashMap = new HashMap<String, Integer>();

        for (LogEntry le : records){

            String recordDate = le.getAccessTime().toString();
            if (recordDate.contains(date)) {

                if (!visitsPerIPHashMap.containsKey(le.getIpAddress())) {

                    visitsPerIPHashMap.put(le.getIpAddress(), 1);

                } else {
                    visitsPerIPHashMap.put(le.getIpAddress(), visitsPerIPHashMap.get(le.getIpAddress()) + 1);
                }
            }
        }
        return visitsPerIPHashMap;

    }

}
