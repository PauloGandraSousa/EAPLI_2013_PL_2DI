/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.RegisterPaymentMethodController;

/**
 *
 * @author Adulcinio
 */
public class RegisterPaymentMethodDebitCardUI extends RegisterPaymentMethodCardBaseUI{
    
    @Override
    public void show()
    {
        super.show();
        RegisterPaymentMethodController controllerDebitCard = new RegisterPaymentMethodController();
        controllerDebitCard.registerPaymentMethodDebitCard(bankname, cardnumber);
    }
    
}
