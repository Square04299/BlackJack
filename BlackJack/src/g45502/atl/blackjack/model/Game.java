/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g45502.atl.blackjack.model;

/**
 *
 * @author G45502
 */
public class Game implements Facade{
     
    private Deck deck;
    private Player player;
    private Player bank;
    private final int MINUMUN_BANK_VALUE;
    private final int MAX_VALUE;

    public Game() {
        this.deck = new Deck();
        this.player = new Player("Player");
        this.bank = new Player("Bank");
        this.MAX_VALUE = 21;
        this.MINUMUN_BANK_VALUE = 17;
    }

    public Deck getDeck() {
        return deck;
    }

    public Player getPlayer() {
        return player;
    }

    public Player getBank() {
        return bank;
    }

    public int getMINUMUN_BANK_VALUE() {
        return MINUMUN_BANK_VALUE;
    }

    public int getMAX_VALUE() {
        return MAX_VALUE;
    }

    
    
    @Override
    public void hit(Player p) {
        p.addCard(deck.hit());
    }

    @Override
    public Player getWinner() {
        return (player.getScore() <= MAX_VALUE && (bank.getScore() > MAX_VALUE 
                || bank.getScore() < player.getScore())) ? player : bank;
    }

    @Override
    public void newRound() {
        deck = new Deck();
        player.clean();
        bank.clean();
        deck.shuffle();
        player.addCard(deck.hit());
        player.addCard(deck.hit());
        
    }

    @Override
    public void stand() {
        do{
            bank.addCard(deck.hit());
        }while(bank.getScore() < MINUMUN_BANK_VALUE);
    }
    
}
