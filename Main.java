
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String s = "POEM: <LINE> <LINE> <LINE> <LINE> <LINE>";
        Production p = new Production(s);
        printString(p.getNonTerminal());
        printString(p.getExpressions().toString());

    }
    static void printString(String s){
        System.out.println(s);
    }
    
}


