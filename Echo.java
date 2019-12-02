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
        StringBuilder sb = new StringBuilder();
        for (String arg : args) {
            sb.append(arg);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}