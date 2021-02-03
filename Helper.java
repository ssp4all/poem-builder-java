
/**
 * All the helper functions used in this project
 *
 * @author Suraj
 */

import java.util.ArrayList;
import java.util.List;
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

public class Helper {

    Helper() {

    }


    public static String getRandomElement(List<String> expressions, Random random) {
        return expressions.get(random.nextInt(expressions.size()));
    }

    //Build complete dictionary which is going to be used to build a peom
    //Hashmap has been used to so...
    public static Map<String, List<List<String>>> buildDictionary(Map<String, List<List<String>>> dictionary) throws FileNotFoundException{
        try{

            File rulesFromFile = new File("rules.txt");
            Scanner fileScanner = new Scanner(rulesFromFile);

            // build a hashmap
            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                List<List<String>> exp = new ArrayList<List<String>>();
                List<String> components = new ArrayList<String>();

                String rule = line.split(": ")[0];

                components.addAll(Arrays.asList(line.split(": ")[1].split(" ")));
                for (String component : components) {
                    List<String> tmpExp = new ArrayList<String>();
                    tmpExp.addAll(Arrays.asList(component.split("\\|")));
                    exp.add(tmpExp);
                }
                dictionary.put(rule, exp);
            }
            fileScanner.close();
            return dictionary; //return hashmap
        }
        catch(Exception e){
            throw e;
        }
    }
    

}