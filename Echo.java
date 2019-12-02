import java.util.*;

/**
 * Echo prints the program arguments to standard output. 
 * Usage: Echo parameter1 parameter2
 */
public class Echo {
    public static void main(String[] args) {
        ParamEvaluator evaluator = new ParamEvaluator(args);
        List<EchoAlgorithm> algorithms = evaluator.evaluate();
        
        StringBuilder sb = new StringBuilder();
        for (EchoAlgorithm algorithm : algorithms) {
            sb.append(algorithm.getTitle());
            sb.append(":").append("\n");
            sb.append(algorithm.execute());
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}