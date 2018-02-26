package com.additionaltasks.file_reader;



public class ModuleRunner {
    public static void main (String args[]){
        File_Input fileReader = new File_Input ();
        try {
            fileReader.ReadFile();
        } catch (FileReaderException e) {
            System.out.println("Problem with reading file!!!");
        }
    }
}
