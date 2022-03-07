package nl.novi;

import java.util.Scanner; // import betekent dat er externe code wordt toegevoegd aan de applicatie.

public class Main {

    // We schrijven de Java-code voorlopig BINNEN de main-methode, dus vanaf regel 9 t/m 37
    public static void main(String[] args) {
        /*
        // Deze code staat in commentaar, grijze code wordt niet uitgevoerd.
        System.out.println("Hello World"); // Met deze regel wordt  tekst op het scherm getoond
        char currentPlayerToken = 'O';
        // Met de bovenstaande regel maken we een variabele aan van het type char (1 enkele karakter),
        // met de naam currentPlayerToken en de waarde O

        System.out.println("De gekozen player token is: " + currentPlayerToken); // We kunnen zo de waarde van de variabele op het scherm tonen
        */

        // Hieronder maken we een Scanner-object aan, met de naam input.
        // Via dit Scanner-object kan de gebruiker informatie doorgeven aan de applicatie.
        Scanner input = new Scanner(System.in); //
        System.out.println("Voer je naam in: ");
        String playerName = input.nextLine(); // Met de nextLine()-methode kunnen we tekst opslaan in de variabele met de naam playerName
        System.out.println("De spelersnaam is: " + playerName);

        System.out.println("Voer je leeftijd in: ");
        int playerAge = input.nextInt(); // Met de nextInt()-methode kunnen we 1 geheel getal opslaan in de int-variabele playerAge

        // Hieronder hebben we een keuzeconstructie; daarmee kunnen we iets controleren
        // We controleren met onderstaande code of de waarde van de playerAge variabele lager is dan 18
        if(playerAge < 18) {
            System.out.println("Je bent te jong, app wordt afgesloten"); // Mocht de waarde lager dan 18 zijn dan komt deze tekst op het scherm
            System.exit(0); // via System.exit() wordt de applicatie afgesloten
        }
        else {
            System.out.println("Welkom bij mijn app! "); // Mocht de waarde van de variable playerAge hoger zijn dan 18 dan krijgt men deze tekst te zien
        }
    }
}

