import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Adjective {
/*    // value
    private String adjective;

    // constructor
    public Adjective(String adjective) {
        this.adjective = adjective;
    }

    // setter and getter
    public String getAdjective() { return adjective; }
    public void setAdjective(String adjective) { this.adjective = adjective; }*/

    public void oppgave2() throws IOException {
        System.out.println("Starter adjektiv-programmet");
        // henter filene
        File file1 = new File("storytest.txt");
        File file2 = new File("adjektivtest.txt");

        Scanner scanner = new Scanner(file2);
        Scanner scanner2 = new Scanner(file1);
        FileWriter writeToFile = new FileWriter(file1, true);
        ArrayList<String> adjArray = new ArrayList<>();
        String adjString;

        // leser gjennom alle adjektivene og adder de inn i ArrayList
        while (scanner.hasNext()) {
            adjString = scanner.next();
            adjArray.add(adjString);
        }
        scanner.close();

        // går gjennom linje for linje i storytest.txt
        while (scanner2.hasNext()) { //bytte plass med hverandre?
            for (String s : adjArray) { //bytte plass med hverandre?
                String row = scanner2.next();
                // splitter opp og legger de i array?
                String[] rowParts = row.split(" ");

                // sjekker om den inneholder __ for å write adjektiv inn
                for (String i : rowParts) {
                    if (i.equals("__")) {
                        writeToFile.write(s);
                    }
                }
            }
        }
    }
}
