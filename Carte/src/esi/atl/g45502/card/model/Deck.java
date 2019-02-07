/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g45502.card.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javafx.print.Collation;

/**
 *
 * @author G45502
 */
public class Deck {
    private List<Carte> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (Color color : Color.values()) {
            for (Value value : Value.values()) {
                Carte card = new Carte(color, value);
                cards.add(card);
            }
        }
    }
    
    public void shuffle(){
        Collections.shuffle(cards);
    }
    
    boolean isEmplty(){
        return cards.isEmpty();
    }
    
    public Carte hit(){
        //test verifier si il y a encore des erreurs
        return cards.remove(0);
    }
    
    int size(){
        return cards.size();
    }

    @Override
    public String toString() {
        return "Deck{" + "cards=" + cards + '}';
    }
    
    
}
