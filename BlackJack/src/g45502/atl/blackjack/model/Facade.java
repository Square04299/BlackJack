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
public interface Facade {
    
    public void add(Carte carte);
    
    public boolean isEmpty();
    
    public void clean();
}
