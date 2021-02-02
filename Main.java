
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    private static String expression = "";
    private static java.util.List<Production> productionList = new ArrayList<Production>();
    private static Random random = new Random();
    private static Map<String, List<List<String>>> productions = new HashMap<String, List<List<String>>>();
    private static Map<String, List<List<String>>> poem = new HashMap<String, List<List<String>>>();

    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileParser fp = new FileParser(); 
            fp.fileParser(productions);
            System.out.println(productions);
        }
        catch(Exception e){
            throw e;
        }
    
    }
    static void printString(String s){
        System.out.println(s);
    }
    
}


