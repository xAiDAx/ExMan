package world.aida.ExMan;

import java.util.Scanner;

public class app {


    public static void main(String[] args) {

        menue();

    }



    public static void menue() {

        int menueAuswahl = -1;

        System.out.printf("Herzlich willkommen im Expeditionsmanager\nBitte wählen Sie eine Option aus: \n\n"

                + "1. Erfassen\n2. anzeigen\n3. öffnen\n4. speichern\n5. Limite Setzen\n6. Algrithmus wählen\n7. Packung optimieren\n8. Hilfe\n9. Info\n0. App beenden \n\n");
        do {
            menueAuswahl = einagebeInt("Bitte wählen Sie einen Menüpunkt: ");
            switch (menueAuswahl) {
                //erfassen
                case 1:
                    erfassen();
                    menueAuswahl=-1;
                    break;
                //anzeigen
                case 2:
                    break;
                //öffnen
                case 3:
                    menueAuswahl = -1;
                    System.out.println("Hier gibt es noch nichts zu sehen");
                    break;
                //speichern
                case 4:
                    menueAuswahl = -1;
                    System.out.println("Hier gibt es noch nichts zu sehen");
                    break;
                //Limite setzten
                case 5:
                    menueAuswahl = -1;
                    System.out.println("Hier gibt es noch nichts zu sehen");
                    break;
                //algorithmus wählen
                case 6:
                    menueAuswahl = -1;
                    System.out.println("Hier gibt es noch nichts zu sehen");
                    break;
                //Packung optimieren
                case 7:
                    menueAuswahl = -1;
                    System.out.println("Hier gibt es noch nichts zu sehen");
                    break;
                //hilfe
                case 8:
                    menueAuswahl = -1;
                    System.out.println("Hier gibt es noch nichts zu sehen");
                    break;
                //Info
                case 9:
                    menueAuswahl = -1;
                    System.out.println("Hier gibt es noch nichts zu sehen");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    menueAuswahl = -1;
                    break;

            }

        } while (menueAuswahl == -1);

    }

    private static int einagebeInt(String aufforderung) {
        Scanner scannner = new Scanner(System.in);
        boolean fertig = false;
        int input = 0;
        String eingabe;

        do {
            System.out.print(aufforderung);
            try {
                eingabe = scannner.next();
                input = Integer.parseInt(eingabe);
                if (input >= 0) {
                    fertig = true;
                } else {

                    throw new NumberFormatException();
                }
            } catch (NumberFormatException nfe) {
                System.out.println("\033[31;1mSie haben keinen gülltigen Wert eingeben. Bitte vesuchen Sie es erneut.\033[0m");

            }
        } while (!fertig);

        return input;

    }

    static private Gegenstand gegenstandEinlesen() {
        String name;
        int gewicht;
        int profit;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie den Namen des Gegenstands ein: ");
        name = scanner.next();

        gewicht = einagebeInt("Geben Sie ein Gewicht ein: ");
        profit = einagebeInt("Geben Sie den Profit ein: ");

        Gegenstand gegenstand = new Gegenstand(name, gewicht, profit);


        return gegenstand;

    }

    private static Gegenstand[] erfassen() {

        Scanner scanner = new Scanner(System.in);
        final int LIMIT = 24;
        Gegenstand[] gegenstände = new Gegenstand[LIMIT];
        boolean forfahren = true;
        int index = 0;
        char bool;
        while (forfahren || index < LIMIT) {
            gegenstände[index] = gegenstandEinlesen();

            System.out.println("Wollen Sie weitere Daten eingeben? n zum abbrechen");

            if (scanner.next().contains("n")) {
                break;

            }

            index++;
        }


 return gegenstände;
    }
}

