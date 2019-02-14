/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g45502.atl.blackjack.model;

import java.util.Objects;

/**
 *Cards of the game
 * @author G45502
 */
public class Carte {

    private Color color;
    private Value value;

    /**
     *Builder of the Object Card
     * @param color of the card that will be in the deck
     * @param value of each card in the deck
     */
    public Carte(Color color, Value value) {
        if (color == null) {
            throw new IllegalArgumentException("Couleur non definie");
        }
        this.value = Objects.requireNonNull(value, "Valeur non definie");
        this.color = color;
        this.value = value;
    }

    /**
     *Getter of the attribute color
     * @return the color of the card
     */
    public Color getColor() {
        return color;
    }

    /**
     *Getter of the attribute value
     * @return the value of the card
     */
    public Value getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Carte{" + "color=" + color + ", value=" + value + '}';
    }
    
    
    
}
