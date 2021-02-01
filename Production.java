
import java.util.ArrayList;
import java.util.List;

public class Production {
    private String nonTerminal;
    private List<String> expressions;

    Production(String production) {
        this.nonTerminal = production.split(": ")[0]; //get rule name

        this.expressions = new ArrayList<String>(); //get rule itself
        for (String expression : production.split(": ", -1)[1].split("\\|")) {
            this.expressions.add(expression);
        }

    }

    public String getNonTerminal() {
        return nonTerminal;
    }

    public List<String> getExpressions() {
        return expressions;
    }

}