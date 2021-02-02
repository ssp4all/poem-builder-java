
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

public class PoemBuilder {

    PoemBuilder() {

    }

    // public static void helper(List<String> list, String poem){
    //     if (list.size() == 1){
    //         String element = list.get(0);
    //         if (element.compareTo("$END") == 0) {
    //             return 
    //         }
    //         else if (element.compareTo("$LINEBREAK") == 0) {
    //             element = System.lineSeparator();
    //             poem += (" " + element);
    //         }
    //         else if (element.length() > 0 and element.startsWith("<")) {
    //            String value = element.substring(0, element.length());

    //            for (List<List<String>> row: {

    //            }
    //         }

    //     }
    //     else{

    //     }
    // }


    public static void buildAPoem(Map<String, List<List<String>>> productions, Random random) throws FileNotFoundException {
        try{
            productions = Helper.buildDictionary(productions);
            
            System.out.println(productions);
            // String s = "suaj";
            // List l = new ArrayList();
            // Class type = l.getClass();
            // System.out.println(type.getSimpleName().equalsIgnoreCase("ArrayList"));

            // if (type.equalIgnoreCase("class java.util.ArrayList"))             
            //     System.out.println("yeah");
            
            // build a poem iteratively
            // String poem = "";
            // process:
            // {
            //     for (List<String> production : productions.get("VERB")) {
            //         String element = Helper.selectRandomElement(production, random);

            //         if (element.startsWith("$")) {
            //             if (element.compareTo("$END") == 0) {
            //                 break process;
            //             }
            //             if (element.compareTo("$LINEBREAK") == 0) {
            //                 element = System.lineSeparator();
            //             }
            //         } else if (element.startsWith("<")) {
            //             String newElement = "";
            //             for (String nonTerminal : Helper.findTerminal(element, productions, random)) {
            //                 newElement += nonTerminal;
            //             }
            //             element = newElement;
            //         }
            //         poem += (" " + element);
            //     }
            // }
            // System.out.println(poem);


        }
        catch(Exception e){
            System.out.println("File Not Found!");
            throw e;
        }
    }
}