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
             int i = 0; // Extra variabele die wordt gebruikt als counter
            // Er zou ook een ArrayList<String> aangemaakt kunnen worden die wordt gevuld met regels uit het tekst-bestand, bijv ArrayList<String> dataLines = new ArrayList<String>();
            while(dataScanner.hasNextLine()) {
                String dataLine = dataScanner.nextLine(); // Hier zou je dus de ArrayList<String> kunnen vullen met data via de add-methode, bijvoorbeeld dataLines.add(dataScanner.nextLine());
                System.out.println("Data: " + dataLine); // dataLine kan je vervangen door dataLines.get(dataLines.size() - 1);;
                i++;  // Hier wordt de counter met 1 verhoogd
                if(i == 2) break; // Deze regel code zorgt ervoor dat er maximaal 2 regels worden gelezen. 
            }
            // Bij gebruik van de ArrayList dataLines kan je de laatste paar regels eventueel opvragen, bijv met subList-methode
            // Zie ook: https://stackoverflow.com/questions/14605999/getting-the-last-three-elements-from-a-list-arraylist
            dataScanner.close();
        }
        catch(Exception ex) {
            System.out.println("Er is iets misgegaan: " + ex.getMessage());
        }
    }

}
