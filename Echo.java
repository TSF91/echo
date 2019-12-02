import java.util.*;
/**
 * Echo prints the program arguments to standard output. 
 * Usage: Echo parameter1 parameter2
 */
public class Echo {
    public static void main(String[] args) {
        if (args.length > 0 && args[0].equals("-h")) {
            System.out.println("Usage: Echo parameter1 parameter2");
            System.exit(0);
        }
        String factorialResult = "";
        if (args[0].equals("-factorial")) {
            List<String> words = new ArrayList<>();
            for (int i = 1; i < args.length; i++) {
                words.add(args[i]);
            }
            factorialResult = getFactorialReport(words);
        }
        StringBuilder sb = new StringBuilder();
        for (String arg : args) {
            sb.append(arg);
            sb.append(" ");
        }

        sb.append(factorialResult);
        System.out.println(sb.toString());
    }

    /** Returns the factorial report as a string */
    public static String getFactorialReport(List<String> words) {
        // Compute the report
        Map<String, Integer> report = new HashMap<>();
        for (String word: words) {
            report.put(word, factorial(word.length()));
        }

        // Stringify the report, then return it
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for (String word: words) {
            sb.append(word)
            .append(":")
            .append(report.get(word))
            .append("\n");
        }
        return sb.toString();
    }

    /** Recursive factorial computer method */
    public static int factorial(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}