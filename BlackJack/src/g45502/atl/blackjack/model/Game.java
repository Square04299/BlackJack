/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g45502.atl.blackjack.model;

/**
 *Logic of the game controllers the player and scores
 * @author G45502
 */
public class Game implements Facade{
     
    private Deck deck;
    private Player player;
    private Player bank;
    private final int MINIMUM_BANK_VALUE;
    private final int MAX_VALUE;

    /**
     *Builder of the Object Game
     */
    public Game() {
        this.deck = new Deck();
        this.player = new Player("Player");
        this.bank = new Player("Bank");
        this.MAX_VALUE = 21;
        this.MINIMUM_BANK_VALUE = 17;
    }

    /**
     *Getter of the attribute deck
     * @return the deck for this game
     */
    public Deck getDeck() {
        return deck;
    }

    /**
     *Getter of the attribute player
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     *Getter of the attribute bank
     * @return the bank
     */
    public Player getBank() {
        return bank;
    }

    /**
     *Getter of the attribute MINIMUM_BANK_VALUE
     * @return the minimum value needed for the bank
     */
    public int getMINIMUM_BANK_VALUE() {
        return MINIMUM_BANK_VALUE;
    }

    /**
     *Getter of the attribute MAX_VALUE
     * @return the MAX_VALUE
     */
    public int getMAX_VALUE() {
        return MAX_VALUE;
    }

    /**
     *Will add a card of the deck in the hand of the player
     * @param p the current player
     */
    @Override
    public void hit(Player p) {
        p.addCard(deck.hit());
    }

    /**
     *Will pick the winner with the best score.
     * the score can't go above the MAX_VALUE otherwise the player will lose
     * @return the winner of the current round
     */
    @Override
    public Player getWinner() {
        return (player.getScore() <= MAX_VALUE && (bank.getScore() > MAX_VALUE 
                || bank.getScore() < player.getScore())) ? player : bank;
    }

    /**
     *Will create a new deck and clear the score, hands of each player 
     * while adding card to the hand of the first player
     */
    @Override
    public void newRound() {
        deck = new Deck();
        player.clean();
        bank.clean();
        deck.shuffle();
        player.addCard(deck.hit());
        player.addCard(deck.hit());
        
    }

    /**
     *Won't hit another card to this hand
     */
    @Override
    public void stand() {
        do{
            bank.addCard(deck.hit());
        }while(bank.getScore() < MINIMUM_BANK_VALUE);
    }
    
}
