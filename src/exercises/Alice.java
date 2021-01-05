package exercises;
import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
       Alice myFirstAlice = new Alice();
       String searchTerm = myFirstAlice.getUserSearchTerm();
       Boolean myResult = myFirstAlice.searchAliceQuote(searchTerm);
       if (myResult == true) {
           myFirstAlice.getWordsIndex(searchTerm);
           myFirstAlice.removeWordFromQuote(searchTerm);
       }
       System.out.println("The result is: " + myResult.toString());
    }

    public void removeWordFromQuote(String searchTerm) {
        String aliceQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String aliceQuoteLowerCase = aliceQuote.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();

        //use substring method to remove section from string
        int startingPoint1 = 0;
        int endingPoint1 = aliceQuoteLowerCase.indexOf(searchTermLowerCase);
        int startingPoint2 = aliceQuoteLowerCase.indexOf(searchTermLowerCase) + searchTermLowerCase.length();

        String newQuote = aliceQuote.substring(startingPoint1, endingPoint1) + aliceQuote.substring(startingPoint2);
        System.out.println("The new quote is: " + newQuote);
    }

    public void getWordsIndex(String searchTerm) {
        String aliceQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String aliceQuoteLowerCase = aliceQuote.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();

        int theIndex = aliceQuoteLowerCase.indexOf(searchTermLowerCase);
        System.out.println("The index is " + theIndex + " and the length is " + searchTermLowerCase.length());
    }

    public String getUserSearchTerm() {
        Scanner scanner = new Scanner(System.in);
        String searchTerm = scanner.nextLine();
        scanner.close();
        return searchTerm;
    }

    public boolean searchAliceQuote(String searchTerm) {
        String aliceQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String aliceQuoteLowerCase = aliceQuote.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();

        Boolean result = aliceQuoteLowerCase.contains(searchTermLowerCase);
        return result;
    }
}
