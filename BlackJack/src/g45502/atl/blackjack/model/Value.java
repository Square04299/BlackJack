/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g45502.atl.blackjack.model;

/**
 *Value of the card
 * @author G45502
 */
public enum Value {

    /**
     *Value of 1
     */
    ACE(1),

    /**
     *Value of 2
     */
    TWO(2),

    /**
     *Value of 3
     */
    THREE(3),

    /**
     *Value of 4
     */
    FOUR(4),

    /**
     *Value of 5
     */
    FIVE(5) ,

    /**
     *Value of 6
     */
    SIX(6),

    /**
     *Value of 7
     */
    SEVEN(7),

    /**
     *Value of 8
     */
    EIGHT(8),

    /**
     *Value of 9
     */
    NINE(9),

    /**
     *Value of 10
     */
    TEN(10),

    /**
     *Value of 10 
     */
    JACK(10),

    /**
     *Value of 10
     */
    QUEEN(10),

    /**
     *Value of 10
     */
    KING(10);
    
    private final int value;

    private Value(int value) {
        this.value = value;
    }

    /**
     *Getter of the attribute Value
     * @return the value of the card
     */
    public int getValue() {
        return value;
    }
    
    
}
