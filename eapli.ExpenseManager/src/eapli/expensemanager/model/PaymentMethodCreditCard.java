package eapli.expensemanager.model;

/**
 *
 * @author Pedro Leal 1110863
 */
public class PaymentMethodCreditCard extends PaymentMethodCard {
    
    public PaymentMethodCreditCard(){
        super();
    }
    
    public PaymentMethodCreditCard(int number, String bankName){
        super(number, bankName);
    }
}