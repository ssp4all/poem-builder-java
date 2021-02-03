/**
 * After building dictionary of poem's rules 
 * Use the dictionary to build peom - recursively
 *
 * @author Suraj
 */

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
    //recursive function to build poem 
    //this method takes input a List of Strings, then if length == 1 then it get all 
    //associated rules eg., <POEM> => <LINE>, <LINE> etc 
    // if length is > 1 then pick one list at random, again call function on picked list
    public static void helper(Map<String, List<List<String>>>  productions, List<String> list, List<String> poem, Random random){
        if (list.size() == 1){
            String element = list.get(0);
            if (element.equalsIgnoreCase("$END")) {
                return;
            }
            else if (element.compareTo("$LINEBREAK") == 0) {
                return;
            }
            else if (element.length() > 0 && element.startsWith("<")) {
                String value = element.substring(1, element.length() - 1);
                if (productions.containsKey(value)){
                    List<List<String>> forEach = productions.get(value);
                    for (List<String> each: forEach){
                        helper(productions, each, poem, random); //recursive call
                    }
                }
            }else{
                poem.add(element);
            }
        }
        else{
            String pick = Helper.getRandomElement(list, random);
            if (productions.containsKey(pick.substring(1, pick.length() - 1))){
                List<String> tmp = new ArrayList<String>();
                tmp.add(pick);
                helper(productions, tmp, poem, random);
                return;
            }
            poem.add(pick);
        }
    }

    //call above recursive function from here
    public static void buildAPoem(Map<String, List<List<String>>> productions, Random random) throws FileNotFoundException {
        try{
            productions = Helper.buildDictionary(productions);
            
            List<String> poem = new ArrayList<String>();
            List<String> input = new ArrayList<String>();
            
            input.add("<POEM>");
            helper(productions, input, poem, random); 
            
            //Display the poem
            String finalPoem = "";
            for (String word: poem){
                if (word.equalsIgnoreCase("$END")){
                    System.out.println();
                    continue;
                }
                System.out.print(word + " ");
            }
           

        }
        catch(Exception e){
            System.out.println("File Not Found!");
            throw e;
        }
    }
}