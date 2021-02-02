
import java.util.ArrayList;
import java.util.List;

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

    public static List<String> findTerminal(String nonTerminal) {
        List<String> tokens = new ArrayList<String>();
        nonTerminal = nonTerminal.substring(nonTerminal.indexOf('<') + 1, nonTerminal.indexOf('>'));
        for (List<String> component : productions.get(nonTerminal)) {
            tokens.add(selectRandomElement(component));
        }
        return tokens;
    }

    public static String selectRandomElement(List<String> expressions) {
        return expressions.get(random.nextInt(expressions.size()));
    }

}