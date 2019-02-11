/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g45502.atl.blackjack.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G45502
 */
public class Player{
    private  List<Carte> hand;
    private int score;

    public Player() {
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    public List<Carte> getHand() {
        return hand;
    }

    public int getScore() {
        return score;
    }

    public void addCard(Carte carte){
        if(carte == null){
            throw new NullPointerException("tu ne donne pas de carte");
        }
        hand.add(carte);
        this.score += carte.getValue().getValue();
    }
    
    public void clean(){
        hand.clear();
        score = 0;
    }
    
    
    
    
    
    
    
}
