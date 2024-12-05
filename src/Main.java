import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String input = scanner.nextLine().trim;

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Zamykanie programu...");
                break;
            }

            try{
                CharStream inputStream = CharStreams.fromString(input);
                CalculatorLexer lexer = new CalculatorLexer(inputStream);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                CalculatorParser parser = new CalculatorParser(tokens);

                // Parsowanie wejścia
                ParseTree tree = parser.expr();

                // Wyświetlenie drzewa składniowego
                System.out.println("Drzewo składniowe:");
                System.out.println(tree.toStringTree(parser));
            }

            catch (Exception e){
                System.out.println("Błąd składniowy: " + e.getMessage());
            }
        }

        scanner.close();
    }
}