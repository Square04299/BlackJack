/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g45502.atl.blackjack.controller;

import g45502.atl.blackjack.model.Game;
import g45502.atl.blackjack.vue.Vue;

/**
 *
 * @author G45502
 */
public class Controller {
    
    private Game game;
    private Vue vue;

    public Controller(Game game, Vue vue) {
        this.game = game;
        this.vue = vue;
    }
    
    public void startBlackjack(){
        do {            
            game.newRound();
            vue.displayNewRound();
            hit();
            if (game.getWinner().equals(game.getPlayer())) {
                game.stand();
            }
            vue.displayRound();
        } while (vue.isNewRound());
    }
    
    private void hit(){
        while (game.getWinner().equals(game.getPlayer()) && vue.isHit()) {            
            game.hit(game.getPlayer());
            vue.displayPlayer(game.getPlayer());
        }
    }
    
}
