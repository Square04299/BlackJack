/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g45502.atl.blackjack.model;

import javax.smartcardio.Card;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G45502
 */
public class PlayerTest {
    
    public PlayerTest() {
    }

    @Test
    public void testAddCard() {
        Player p = new Player("Christopher");
        Carte expected = new Carte(Color.CLUB, Value.ACE);
        p.addCard(expected);
        Carte carte = p.getHand().get(0);
        assertTrue(carte.getColor() == Color.CLUB 
                && carte.getValue() == Value.ACE);
    }

    @Test
    public void testClean() {
        Player p = new Player("Christopher");
        Carte carte = new Carte(Color.CLUB, Value.ACE);
        p.addCard(carte);
        p.clean();
        assertTrue(p.getScore() == 0 && p.getHand().isEmpty());
    }
    
}
