package nl.novi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FileManager.readData();

        // Aanmaken van verzamelingen en Scanner input
	    //String[] studentNames = new String[5];
	    //int[] studentGrades = new int[5];
	    ArrayList<Student> students = new ArrayList<Student>();
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 2; i++) {
            Student tmpStudent = new Student(); // Aanmaken Student-object
            System.out.println("Dit is de "+i+"e keer");
            System.out.println("Voer de naam van de student in: ");
            //String studentName = input.nextLine();
            //studentNames[i] = input.nextLine();
            tmpStudent.name = input.nextLine(); // 1 variabele van object wordt gevuld
            //System.out.println("Ingevoerde naam is: " + studentName);
            //System.out.println("Ingevoerde naam is: " + studentNames[i]);
            System.out.println("Ingevoerde naam is: " + tmpStudent.name);
            System.out.println("Voer het cijfer in: ");
            //int studentGrade  = input.nextInt();
            //studentGrades[i] = input.nextInt();
            tmpStudent.grade = input.nextInt();
            //System.out.println("Ingevoerde cijfer is: " + studentGrade);
            //System.out.println("Ingevoerde cijfer is: " + studentGrades[i]);
            System.out.println("Ingevoerde cijfer is: " + tmpStudent.grade);
            input.nextLine();
            students.add(tmpStudent);

            // We kopieren de studentName-variabele naar de studentNames-verzameling
            //studentNames[i] = studentName;
            // We kopieren de studentGrade-variabele naar de studentGrade-verzameling
            //studentGrades[i] = studentGrade;
        }


        // Hieronder roepen we van de Utils-klasse, de showAllData-methode aan
       // Utils.showAllData(studentNames, studentGrades);

        // showData methode; daar geven we de students lijst aan mee
        showData(students);

        // Via de FileManager.saveData()-methode slaan we de studenten lijst op in een tekst-bestand
        FileManager.saveData(students);
        // Via de FileManager.readData()-methode halen we de studenten informatie op uit een tekst-bestand
        FileManager.readData();
    }

    public static void showData(ArrayList<Student> students) {
        for(int i = 0; i < students.size(); i++) {
            Student tmpStudent = students.get(i);
            tmpStudent.showDetails();
        }
        // for-each loop die hetzelfde doet als bovenstaande:
        /*
        for(Student tmpStudent : students) {
            tmpStudent.showDetails();
        }
         */
    }

    /*
    // Onderstaande methode is verplaatst naar Utils-klasse
    public static void showAllData(String[] names, int[] grades) {
        int counter = 0;
        // for(int counter = 0; counter < studentNames.length; counter++) {
        while(counter < names.length) {
            System.out.println("Studentnaam: " + names[counter]);
            System.out.println("Cijfer: " + grades[counter]);
            counter++;
        }
    }
     */


}
