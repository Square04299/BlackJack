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
public class Player implements Facade{
    private List<Carte> hand;

    public Player() {
        this.hand = new ArrayList<>();
    }

    public List<Carte> getHand() {
        return hand;
    }

    @Override
    public void add(Carte carte){
        hand.add(carte);
    }
    
    @Override
    public boolean isEmpty(){
        return hand.isEmpty();
    }
    
    @Override
    public void clean(){
        hand.clear();
    }
    
    
    
    
    
    
    
}
