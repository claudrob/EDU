package my.edu.test;

import my.edu.univeristy.ManageFiles;

public class TestManageFiles {

    public static void main(String[] args) {
        String fileName = "data/test.txt";
        System.out.println("Testing file creation for filename: " + fileName);
//        ManageFiles.createFile(fileName);
//        ManageFiles.writeFile(fileName, "Hello from Claud!");
//        ManageFiles.addToFile(fileName, "Hello from Claud!");
//        ManageFiles.addToFile(fileName, "Testing writing to file!");

        ManageFiles.readFile(fileName);


    }


}
