import java.util.*;

public class ParamEvaluator {
    
    private static final String REVERSE = "-reverse";
    private static final String PALINDROME = "-palindrome";
    private static final String FACTORIAL = "-factorial";

    private List<String> arguments;
    private List<String> words;

    public ParamEvaluator(String[] args) {
        this.arguments = new ArrayList<>();
        this.words = new ArrayList<>();
        parseArguments(args);
    }

    /** Separates the arguments from the words */
    private void parseArguments(String[] args) {
        for (String arg: args) {
            if (arg.startsWith("-")) {
                arguments.add(arg);
                continue;
            }
            words.add(arg);
        }
        System.out.println(arguments);
        System.out.println(words);
    } 

    /** Returns the list of algorithms, ready to execute. */
    public List<EchoAlgorithm> evaluate() {
        List<EchoAlgorithm> algorithms = new ArrayList<>();
        for (String argument: arguments) {
            if (argument.equals(REVERSE)) {
                // Create, and add the reverser
                continue;
            }
            if (argument.equals(PALINDROME)) {
                // Create, and add the PalindromeEvaluator
                continue;
            }
            if (argument.equals(FACTORIAL)) {
                // Create, and add the FactorialWords
                continue;
            }
            System.out.println("warning: detected unknown operation '" + argument + "'");
        }
        return algorithms;
    }
}