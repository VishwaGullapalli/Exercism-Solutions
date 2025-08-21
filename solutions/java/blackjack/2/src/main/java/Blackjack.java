public class Blackjack {

    public int parseCard(String card) {
        // throw new UnsupportedOperationException("Please implement the Blackjack.parseCard method");
        if (card.equalsIgnoreCase("ace")) {
            return 11;
        } else if (card.equalsIgnoreCase("two")) {
            return 2;
        } else if (card.equalsIgnoreCase("three")) {
            return 3;
        } else if (card.equalsIgnoreCase("four")) {
            return 4;
        } else if (card.equalsIgnoreCase("five")) {
            return 5;
        } else if (card.equalsIgnoreCase("six")) {
            return 6;
        } else if (card.equalsIgnoreCase("seven")) {
            return 7;
        } else if (card.equalsIgnoreCase("eight")) {
            return 8;
        } else if (card.equalsIgnoreCase("nine")) {
            return 9;
        } else if (card.equalsIgnoreCase("ten")) {
            return 10;
        } else if (card.equalsIgnoreCase("jack")) {
            return 10;
        } else if (card.equalsIgnoreCase("queen")) {
            return 10;
        } else if (card.equalsIgnoreCase("king")) {
            return 10;
        } else {
            return 0;
        }
    }

    public boolean isBlackjack(String card1, String card2) {
        // throw new UnsupportedOperationException("Please implement the Blackjack.isBlackjack method");
        if (parseCard(card1) + parseCard(card2) == 21) {
            return true;
        } else {
            return false;
        }
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        // throw new UnsupportedOperationException("Please implement the Blackjack.largeHand method");
        
    }

    public String smallHand(int handScore, int dealerScore) {
        // throw new UnsupportedOperationException("Please implement the Blackjack.smallHand method");
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
