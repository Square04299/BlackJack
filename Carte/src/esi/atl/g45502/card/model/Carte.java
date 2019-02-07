/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g45502.card.model;

import java.util.Objects;

/**
 *
 * @author G45502
 */
public class Carte {

    private Color color;
    private Value value;

    public Carte(Color color, Value value) {
        if (color == null) {
            throw new IllegalArgumentException("Couleur non definie");
        }
        this.value = Objects.requireNonNull(value, "Valeur non definie");
        this.color = color;
        this.value = value;
    }

    public Color getColor() {
        return color;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Carte{" + "color=" + color + ", value=" + value + '}';
    }
    
    
    
}
