/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

/**
 *
 * @author schmitzoide
 */
public interface PaymentMethod {
    //FIX: is the enumartion really necessary?
    public static enum types { CREDITCARD, DEBITCARD, CASH, CHECK };
}
