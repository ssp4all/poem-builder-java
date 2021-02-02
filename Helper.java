
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

    public static String getNonTerminal(String production) {
        String nonTerminal = production.split(": ")[0]; //get rule name
        return nonTerminal;
    }

    public static List<String> getExpressions(String production) {
        List<String> expressions = new ArrayList<String>(); //get rule itself
        for (String expression : production.split(": ", -1)[1].split("\\|")) {
            expressions.add(expression);
        }
        return expressions;
    }

    public static List<String> findTerminal(String nonTerminal, Map<String, List<List<String>>> productions, Random random) {
        List<String> tokens = new ArrayList<String>();
        nonTerminal = nonTerminal.substring(nonTerminal.indexOf('<') + 1, nonTerminal.indexOf('>'));
        for (List<String> component : productions.get(nonTerminal)) {
            tokens.add(selectRandomElement(component, random));
        }
        System.out.println("tokens" + tokens.toString());
        return tokens;
    }

    public static String selectRandomElement(List<String> expressions, Random random) {
        return expressions.get(random.nextInt(expressions.size()));
    }

}