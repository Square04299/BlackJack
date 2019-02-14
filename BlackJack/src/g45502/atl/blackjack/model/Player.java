/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g45502.atl.blackjack.model;

import java.util.ArrayList;
import java.util.List;

/**
 *Information of a player name, score, cards in hand
 * @author G45502
 */
public class Player{
    
    private String name;
    private List<Carte> hand;
    private int score;

    /**
     *Builder of the Object Player
     * @param name Name of one player
     */
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    /**
     *Getter of the attribute hand
     * @return the hand of the player
     */
    public List<Carte> getHand() {
        return hand;
    }

    /**
     *Getter of the attribute hand
     * @return name of the player
     */
    public String getName() {
        return name;
    }

    /**
     *Getter of the attribute score
     * @return score of the player
     */
    public int getScore() {
        return score;
    }

    /**
     *Add a card to the hand of the player
     * @param carte To add to the list name hand
     */
    public void addCard(Carte carte){
        if(carte == null){
            throw new NullPointerException("tu ne donne pas de carte");
        }
        hand.add(carte);
        this.score += carte.getValue().getValue();
    }
    
    /**
     *Will reset the Score and Hand of the player
     */
    public void clean(){
        hand.clear();
        score = 0;
    }
    
    
    
    
    
    
    
}
