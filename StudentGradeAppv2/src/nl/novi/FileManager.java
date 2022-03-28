package nl.novi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {

    public static void saveData(ArrayList<Student> students) {
        try {
            File dataFile = new File("data.txt");
            FileWriter fw = new FileWriter(dataFile, true);
            BufferedWriter printer = new BufferedWriter(fw);
            for(int i = 0; i < students.size(); i++ ) {
                Student tmpStudent = students.get(i);
                printer.write("Student " + tmpStudent.name +
                        " heeft cijfer: " + tmpStudent.grade);
                printer.newLine();
            }
            printer.close();
        }
        catch(Exception ex) {
            System.out.println("Er is iets fout gegaan: " + ex.getMessage());
        }
    }

    public static void readData() {
        File dataFile = new File("data.txt");
        try {
            Scanner dataScanner = new Scanner(dataFile);
            while(dataScanner.hasNextLine()) {
                String dataLine = dataScanner.nextLine();
                System.out.println("Data: " + dataLine);
            }
            dataScanner.close();
        }
        catch(Exception ex) {
            System.out.println("Er is iets misgegaan: " + ex.getMessage());
        }
    }

}
