package search;

public class SearchApplication {
    public static void main(String[] args) {
        if (args[0].equalsIgnoreCase("search")) {
            Search.findPatternInFile(args[0], args[1]);
        } else {
            System.out.println("Invalid command");
        }
    }
}
