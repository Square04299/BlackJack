/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g45502.atl.blackjack.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *Collection of cards
 * @author G45502
 */
public class Deck {
    private List<Carte> cards;

    /**
     *Builder of the Object Deck
     */
    public Deck() {
        cards = new ArrayList<>();
        for (Color color : Color.values()) {
            for (Value value : Value.values()) {
                Carte card = new Carte(color, value);
                cards.add(card);
            }
        }
    }
    
    /**
     *Will randomize the cards in the deck
     */
    public void shuffle(){
        Collections.shuffle(cards);
    }
    
    /**
     *Will remove a card from the deck
     * @return the card that have been removed from the deck
     */
    public Carte hit(){
        return cards.remove(0);
    }

    @Override
    public String toString() {
        return "Deck{" + "cards=" + cards + '}';
    }
    
    
}
