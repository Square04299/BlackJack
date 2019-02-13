/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g45502.atl.blackjack.blackjack;

import g45502.atl.blackjack.controller.Controller;
import g45502.atl.blackjack.model.Game;
import g45502.atl.blackjack.vue.Vue;

/**
 *
 * @author G45502
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game game = new Game();
        Vue vue = new Vue(game);
        new Controller(game, vue).startBlackjack();
    }
    
}
