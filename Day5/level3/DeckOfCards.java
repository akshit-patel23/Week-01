import java.util.*;

public class DeckOfCards {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        
        // Create the deck
        String[] deck = new String[numOfCards];
        int index = 0;

        // Populate the deck with "rank of suit"
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();
        
        // Shuffle the deck using Fisher-Yates algorithm
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + rand.nextInt(deck.length - i);  // Get a random card number between i and n
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Method to distribute the deck of n cards to x players
    public static String[][] distributeCards(String[] deck, int numCards, int numPlayers) {
        if (numCards % numPlayers != 0) {
            System.out.println("Cards cannot be evenly distributed to players.");
            return null;
        }
        
        // Create a 2D array to store players and their cards
        String[][] playersCards = new String[numPlayers][numCards / numPlayers];

        int cardIndex = 0;
        
        // Distribute the cards to players
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < numCards / numPlayers; j++) {
                playersCards[i][j] = deck[cardIndex++];
            }
        }
        return playersCards;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.print("Player " + (i + 1) + " cards: ");
            for (int j = 0; j < playersCards[i].length; j++) {
                System.out.print(playersCards[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Initialize the deck
        String[] deck = initializeDeck();
        
        // Step 2: Shuffle the deck
        deck = shuffleDeck(deck);
        
        // Step 3: Input number of players and cards to distribute
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        
        System.out.print("Enter the number of cards each player should get: ");
        int numCardsPerPlayer = scanner.nextInt();
        
        int totalCards = numPlayers * numCardsPerPlayer;
        
        // Check if the total cards can be evenly distributed
        if (totalCards > deck.length) {
            System.out.println("Not enough cards in the deck.");
            return;
        }

        // Step 4: Distribute the cards to the players
        String[][] playersCards = distributeCards(deck, totalCards, numPlayers);

        // Step 5: Print the players and their cards
        if (playersCards != null) {
            printPlayersCards(playersCards);
        }

        scanner.close();
    }
}