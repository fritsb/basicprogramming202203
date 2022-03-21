package nl.novi;

public class Utils {
    // Methode om alle data weer te geven
    // Met behulp van een while-lus wordt er door de verzameling heen gelust
    public static void showAllData(String[] names, int[] grades) {
        int counter = 0;
        // for(int counter = 0; counter < studentNames.length; counter++) {
        while(counter < names.length) {
            System.out.println("Studentnaam: " + names[counter]);
            System.out.println("Cijfer: " + grades[counter]);
            counter++;
        }
    }
}
