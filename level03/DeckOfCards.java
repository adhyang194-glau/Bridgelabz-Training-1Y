package com.gla.strings.level03;

import java.util.*;

class Card {
    String suit;
    String rank;

    Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};

        List<Card> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(suit, rank));
            }
        }
        Collections.shuffle(deck);
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();
        if (players * cardsPerPlayer > deck.size()) {
            System.out.println("Not enough cards to distribute!");
            sc.close();
            return;
        }
        List<List<Card>> playerHands = new ArrayList<>();
        for (int i = 0; i < players; i++) {
            List<Card> hand = new ArrayList<>();
            for (int j = 0; j < cardsPerPlayer; j++) {
                hand.add(deck.remove(0));
            }
            playerHands.add(hand);
        }
        System.out.println("\n--- Distribution Result ---");
        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i + 1) + ": " + playerHands.get(i));
        }

        sc.close();
    }
}
