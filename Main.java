/*******************************
* Author: Suraj Pawar
* Goal: Random poem generator using given Context Free Grammer
* Purpose: Sift Technical Test
*******************************

Logic used to solve above challenge

1) First build a HashMap called dictionary which is made up of rules
    reqqired to generate peom.
2) Recursively build poem by selecting a random class object
3) Print final result
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import java.io.IOException;

public class Main {

    private static Random random = new Random();
    private static Map<String, List<List<String>>> productions = new HashMap<String, List<List<String>>>();

    public static void main(String[] args) throws IOException {
        try{
            PoemBuilder.buildAPoem(productions, random); //call poem builder
        }
        catch(Exception e){
            throw e;
        }
    
    }
    
    
}


