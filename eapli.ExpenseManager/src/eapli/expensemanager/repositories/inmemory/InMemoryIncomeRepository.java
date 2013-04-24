/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories.inmemory;

import eapli.expensemanager.model.Income;
import eapli.expensemanager.repositories.IncomeRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author António
 */
public class InMemoryIncomeRepository implements IncomeRepository{

    static List<Income> incomes = new ArrayList<Income>();
    
    @Override
    public void save(Income income) {
        incomes.add(income);
    }

    //TODO consider using Collections.unmodifiableList instead List
    @Override
    public List<Income> getAll() {
        return incomes;
    }
    
}
