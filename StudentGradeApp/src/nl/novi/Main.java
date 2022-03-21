package nl.novi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Aanmaken van verzamelingen en Scanner input
	    String[] studentNames = new String[5];
	    int[] studentGrades = new int[5];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < studentNames.length; i++) {
            System.out.println("Dit is de "+i+"e keer");
            System.out.println("Voer de naam van de student in: ");
            String studentName = input.nextLine();
            System.out.println("Ingevoerde naam is: " + studentName);
            System.out.println("Voer het cijfer in: ");
            int studentGrade  = input.nextInt();
            System.out.println("Ingevoerde cijfer is: " + studentGrade);
            input.nextLine();

            // We kopieren de studentName-variabele naar de studentNames-verzameling
            studentNames[i] = studentName;
            // We kopieren de studentGrade-variabele naar de studentGrade-verzameling
            studentGrades[i] = studentGrade;
        }


        // Hieronder roepen we van de Utils-klasse, de showAllData-methode aan
        Utils.showAllData(studentNames, studentGrades);
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
