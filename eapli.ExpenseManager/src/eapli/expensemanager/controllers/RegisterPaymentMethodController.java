/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;

import eapli.expensemanager.model.PaymentMethodCreditCard;
import eapli.expensemanager.model.PaymentMethodDebitCard;
import eapli.expensemanager.repositories.PaymentMethodRepository;
import eapli.expensemanager.repositories.RepositoryFactory;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class RegisterPaymentMethodController extends BaseController{
    
     public void registerPaymentMethodDebitCard(String bankName, String cardNumber) {
        
       try {
         PaymentMethodDebitCard payMethodDebCard = new PaymentMethodDebitCard(cardNumber,bankName);
         
          PaymentMethodRepository repoPayMetDebit = RepositoryFactory.instance().getPaymentMethodRepository();
          repoPayMetDebit.save(payMethodDebCard);
      } catch(IllegalArgumentException ile)  {
           System.out.println("Argumentos Inválidos: "+ile.getMessage());
       }   
    }
     public void registerPaymentMethodCreditCard(String bankName, String cardNumber) {
        
       try {
         PaymentMethodCreditCard payMethodDebCard = new PaymentMethodCreditCard(cardNumber,bankName);
       
        PaymentMethodRepository repoPayMetCredit = RepositoryFactory.instance().getPaymentMethodRepository();
        repoPayMetCredit.save(payMethodDebCard);
        } catch(IllegalArgumentException ile)  {
           System.out.println("Argumentos Inválidos: "+ile.getMessage());
       } 
    }
}
