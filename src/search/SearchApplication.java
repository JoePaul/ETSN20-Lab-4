package search;

public class SearchApplication {
    public static void main(String[] args) {
        if (args[0].equalsIgnoreCase("search")) {
            Search.findPatternInFile(args[1], args[2]);
        } else {
            System.out.println("Invalid command");
        }
    }
}
