/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.ListExpenseTypeController;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ListExpenseTypeUI extends BaseUI{

    void show() {
        ListExpenseTypeController listControllerType = new ListExpenseTypeController();
        
        //listControllerType.getExpenseTypes().toString();
       // System.out.println(listControllerType.getExpenseTypes().toString());
        for (int i = 0; i < listControllerType.getExpenseTypes().size(); i++) {
            System.out.println(listControllerType.getExpenseTypes().get(i));
        }
        System.out.println("OK");
    }
    
}