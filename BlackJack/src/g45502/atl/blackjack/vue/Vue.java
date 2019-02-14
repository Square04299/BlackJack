/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g45502.atl.blackjack.vue;

import g45502.atl.blackjack.model.Carte;
import g45502.atl.blackjack.model.Color;
import g45502.atl.blackjack.model.Game;
import g45502.atl.blackjack.model.Player;
import java.util.Scanner;

/**
 * View all information that the controller needs
 * @author G45502
 */
public class Vue {
    
    private Game blackjack;
    private Scanner sc;

    /**
     * Builder of the Object Vue
     * @param blackjack The Object Game
     */
    public Vue(Game blackjack) {
        this.blackjack = blackjack;
        this.sc = new Scanner(System.in);
    }
    
    /**
     *Check if a player has written hit in the console
     * @return true if the player write hit
     */
    public boolean isHit(){
        System.out.println("Hit or Stand");
        return sc.next().equalsIgnoreCase("hit");
    }
    
    /**
     *Display each card that the player has in his hand
     * @param player Object that we will display
     */
    public void displayHand(Player player){
        System.out.println("Deck : ");
        player.getHand().forEach((card) ->{
            displayCard(card);
        });
    }
    
    /**
     *Display the color of the card that the player has
     * between red and black
     * @param carte Object that will tell which color to pick
     */
    public void displayCard(Carte carte){
        String color;
        if(carte.getColor() == Color.DIAMOND 
                || carte.getColor() == Color.HEART){
            color = "\u001B[41m\u001B[37m\u001B[1m";
        }else{
            color = "\u001B[47m\u001B[30m\u001B[1m";
        }
        System.out.println(color + carte.getValue() + " of " + carte.getColor()
                + "\u001B[0m");
    }
    
    /**
     *Display the score of the current player
     * @param player Object that define the current player
     */
    public void displayScore(Player player){
        System.out.println("Score : " + player.getScore());
    }
    
    /**
     *Display the winner of the current round
     */
    public void displayWinner(){
        System.out.println("BlackJack Winner\n\n");
        displayPlayer(blackjack.getWinner());
    }
    
    /**
     *Display the information of the player
     * @param player Object current player
     */
    public void displayPlayer(Player player){
        System.out.println("Player " + player.getName());
        displayScore(player);
        displayHand(player);
    }
    
    /**
     *Display if the player wants to play an other round
     * @return true if the player write y or Y
     */
    public boolean isNewRound(){
        System.out.println("Do you want to play a new Round (Y/N)");
        return sc.next().equalsIgnoreCase("y");
    }
    
    /**
     *Display all information about the bank and player.
     * Display card, score and will pick the winner of the round
     */
    public void displayRound(){
        System.out.println("\nRound\n\n");
        displayPlayer(blackjack.getPlayer());
        displayPlayer(blackjack.getBank());
        displayWinner();
        System.out.println("\nEnd Round\n");
        System.out.println("Thank you for player");
    }
    
    /**
     *Display all information of the current player of the newRound
     */
    public void displayNewRound(){
        System.out.println("\nNew Round\n");
        displayPlayer(blackjack.getPlayer());
    }
}
