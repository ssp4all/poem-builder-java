
import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;
import java.lang.*;

public class FileParser {

    FileParser() {

    }

    void fileParser(Map<String, List<List<String>>> productions) throws FileNotFoundException {
        try{
            File rulesFromFile = new File("rules.txt");
        
        
            Scanner fileScanner = new Scanner(rulesFromFile);

            while (fileScanner.hasNext()) {
                String production = fileScanner.nextLine();
                List<List<String>> expressions = new ArrayList<List<String>>();
                List<String> components = new ArrayList<String>();

                String nonTerminal = production.split(": ")[0];

                components.addAll(Arrays.asList(production.split(": ")[1].split(" ")));
                for (String component : components) {
                    List<String> expression2 = new ArrayList<String>();
                    expression2.addAll(Arrays.asList(component.split("\\|")));
                    expressions.add(expression2);
                }
                productions.put(nonTerminal, expressions);
            }

            // System.out.print(productions);

            String poem = "";
            process:
            {
                for (List<String> production : productions.get("VERB")) {
                    String element = selectRandomElement(production);

                    if (element.startsWith("$")) {
                        if (element.compareTo("$END") == 0) {
                            break process;
                        }
                        if (element.compareTo("$LINEBREAK") == 0) {
                            element = System.lineSeparator();
                        }
                    } else if (element.startsWith("<")) {
                        String newElement = "";
                        for (String nonTerminal : findTerminal(element)) {
                            newElement += nonTerminal;
                        }
                        element = newElement;
                    }
                    poem += (" " + element);
                }
            }
            System.out.println(poem);


        }
        catch(Exception e){
            System.out.println("File Not Found!");
            throw e;
        }

    }



}