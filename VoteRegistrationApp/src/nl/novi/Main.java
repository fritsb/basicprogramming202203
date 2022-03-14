package nl.novi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Code hieronder is meest simpele vorm, maar komt niet overeen met de praktijk
        System.out.println("Op welke partij wil je stemmen?");
        // Aanmaken scanner object & string vote variabele. De gebruikersinvoer wordt gekopieerd naar de
        // vote variabele. De regel daaronder toont de invoer op het scherm.
        Scanner in = new Scanner(System.in);
        String voteParty  = in.nextLine();
        voteParty = voteParty.toUpperCase();
        System.out.println("Je wilt op de volgende partij stemmen: " + voteParty);

        // Praktijk is dat we op kandidaten stemmen ipv een partij. Hiervoor kunnen we arrays (verzamelingen) toepassen
        // Het aanmaken van arrays kan op meerdere manieren, hieronder 2 verschillende manieren.
        String[] cda = new String[]{"Botman","Visser","Rood","Neefjes","Brieffies" };
        String[] vvd = new String[5];
        vvd[0] = "Bakker";
        vvd[1] = "Oud";
        vvd[2] = "Groot";
        vvd[3] = "Wever";
        vvd[4] = "Zwagerman";

        // If/else statement, zodat de kiezer de juiste kandidaten op het scherm krijgt.    
        if(voteParty.equals("VVD")) {
            for(int i =0; i < vvd.length; i++) {
                System.out.println("Kandidaat VVD "+(i+1)+": "+vvd[i]);
            }
        }
        else if(voteParty.equals("CDA")) {
            // Tonen van kandidaten op het scherm
            for(int i =0; i < cda.length; i++) {
                System.out.println("Kandidaat CDA " + (i+1) + ": " + cda[i]);
            }
        }
        else {
            System.out.println("Ongeldige stem.");
        }

        // Welke kandidaat?
        System.out.println("Op welke kandidaat wil je stemmen van de partij " + voteParty + "?");
        int voteCandidate = in.nextInt();
        if(voteParty.equals("VVD")) {
            System.out.println("Je hebt gestemd op: " + vvd[voteCandidate-1]);
        }
        else if(voteParty.equals("CDA")) {
            System.out.println("Je hebt gestemd op: " + cda[voteCandidate-1]);
        }


        // Er zitten wat fouten in deze applicatie:
        // - Men kan op ongeldige partijen / kandidaten stemmen. Er is daar nog geen goede controle op (kan wel ingebouwd worden met bijv if/else)
        // - Er wordt nog niet geteld hoeveel stemmen er zijn. De stemmen kunnen eventueel opgeslagen worden in een verzameling.

    }
}
