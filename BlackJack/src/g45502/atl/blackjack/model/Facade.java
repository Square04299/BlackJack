/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g45502.atl.blackjack.model;

/**
 *The interface of the Game
 * @author G45502
 */
public interface Facade {
    /**
     *Will add a card of the deck in the hand of the player
     * @param p the current player
     */
    public void hit(Player p);
     /**
     *Will pick the winner with the best score.
     * the score can't go above the MAX_VALUE otherwise the player will lose
     * @return the winner of the current round
     */
    public Player getWinner();
    /**
     *Will create a new deck and clear the score, hands of each player 
     * while adding card to the hand of the first player
     */
    public void newRound();
    /**
     *Won't hit another card to this hand
     */
    public void stand();
    
    

   

    

    
}
