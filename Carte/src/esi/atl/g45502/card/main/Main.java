/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g45502.card.main;

import esi.atl.g45502.card.model.Carte;
import esi.atl.g45502.card.model.Deck;



/**
 *
 * @author G45502
 */
public class Main {
    public static void main(String[] args) {
        int nbCarte = Integer.parseInt(args[0]);
        Deck deck = new Deck();
        deck.shuffle();
        
        for (int index = 0; index < nbCarte; index++) {
            Carte card = deck.hit();
            System.out.println(card);
        }
    }
}
