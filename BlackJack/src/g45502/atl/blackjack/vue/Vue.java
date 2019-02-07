/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g45502.atl.blackjack.vue;

import java.util.Scanner;

/**
 *
 * @author G45502
 */
public class Vue {
    
    private Scanner sc;
    
    public void Vue(){
        this.sc = new Scanner(System.in);
    }
    
    void displayhand(){
        System.out.println("Carte dans votre main");
    }
}
