/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g45502.atl.blackjack.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G45502
 */
public class GameTest {
    
    public GameTest() {
        Game game = new Game();
        assertTrue(game.getPlayer() != null 
                && game.getBank() != null);
        assertTrue(game.getMINIMUM_BANK_VALUE() == 17 
                && game.getMAX_VALUE() == 21);
    }

    @Test
    public void testHit() {
        Game game = new Game();
        game.hit(game.getPlayer());
        assertTrue(game.getPlayer().getHand().size() != 52 
                && game.getPlayer().getHand().size() == 1);
    }

    @Test
    public void testGetWinner() {
        Game game = new Game();
        game.newRound();
        game.hit(game.getBank());
        game.hit(game.getBank());
    }

    @Test
    public void testNewRound() {
        Game game = new Game();
        game.hit(game.getPlayer());
        game.hit(game.getBank());
    }

    @Test
    public void testStand() {
        Game game = new Game();
        game.newRound();
        game.stand();
        assertFalse(game.getBank().getHand().isEmpty());
    }
    
}
