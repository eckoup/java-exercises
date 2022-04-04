package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the search word");
        String search = scanner.nextLine();
        System.out.println("What is the replacement word");
        String replace = scanner.nextLine();
        System.out.println("What is the source file?");
        String filename = scanner.nextLine();
        //path to source file
        System.out.println("What is the destination file?");
        String destination = scanner.nextLine();
        //path to destination file
        try{
            FindAndReplace.FindReplace(search, replace, filename, destination);
            }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void FindReplace(String searchWord, String replaceWord, String replaceFile, String destinationFile) throws FileNotFoundException {
        File dataFile = new File(replaceFile);
        File destination = new File(destinationFile);
        Scanner datain = new Scanner(dataFile);
        PrintWriter dataOutput = new PrintWriter(destination);

        while (datain.hasNextLine()) {
            String lineOfInput = datain.nextLine();
            String newLine = lineOfInput.replaceAll(searchWord, replaceWord);
            dataOutput.println(newLine);
        }
        dataOutput.close();
    }
}


