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
 *
 * @author G45502
 */
public class Vue {
    
    private Game blackjack;
    private Scanner sc;

    public Vue(Game blackjack) {
        this.blackjack = blackjack;
        this.sc = new Scanner(System.in);
    }
    
    
    
    public boolean isHit(){
        System.out.println("Hit or Stand");
        return sc.next().equalsIgnoreCase("hit");
    }
    
    public void displayHand(Player player){
        System.out.println("Deck : ");
        player.getHand().forEach((card) ->{
            displayCard(card);
        });
    }
    
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
    
    public void displayScore(Player player){
        System.out.println("Score : " + player.getScore());
    }
    
    public void displayWinner(){
        System.out.println("BlackJack Winner\n\n");
        displayPlayer(blackjack.getWinner());
    }
    
    public void displayPlayer(Player player){
        System.out.println("Player " + player.getName());
        displayScore(player);
        displayHand(player);
    }
    
    public boolean isNewRound(){
        System.out.println("Do you want to play a new Round (Y/N)");
        return sc.next().equalsIgnoreCase("y");
    }
    
    public void displayRound(){
        System.out.println("\nRound\n\n");
        displayPlayer(blackjack.getPlayer());
        displayPlayer(blackjack.getBank());
        displayWinner();
        System.out.println("\nEnd Round\n");
        System.out.println("Thank you for player");
    }
    
    public void displayNewRound(){
        System.out.println("\nNew Round\n");
        displayPlayer(blackjack.getPlayer());
    }
}
