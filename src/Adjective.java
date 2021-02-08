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

    public void oppgave2() throws Exception {
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

        // teller gjennom alle adjektivene og printer de ut til terminal
        for (String s : adjArray) {
            while (scanner2.hasNextLine()) {
                String row = scanner2.nextLine();
                String[] rowParts = row.split(" ");

                for (String i : rowParts) {
                    if (i.equals("__")) {
                        writeToFile.write(s);
                    }
                }
            }
        }
    }
}
