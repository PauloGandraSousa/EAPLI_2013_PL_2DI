/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.repositories.inmemory;

import eapli.expensemanager.model.Expense;
import eapli.expensemanager.repositories.ExpenseRepository;
import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class InMemoryExpenseRepository implements ExpenseRepository{

    static List<Expense> expenses = new ArrayList<Expense>();
    
    @Override
    public void save(Expense expense) {
        expenses.add(expense);
    }

    @Override
    public BigDecimal ExpensesOfWeek(int weekNumber, int year) {
        BigDecimal sum = new BigDecimal(0.00);
        for(Expense e: expenses){
            if(e.occursAt(year, weekNumber)){
                sum = sum.add(e.getAmount());
            }
        }
        return sum;
    }
    @Override
    public BigDecimal expensesOfMonth(int month, int year) {
        BigDecimal sum = new BigDecimal(0.00);
        for (Expense e : expenses) {
            if (e.occursAtMonth(month, year)) {
                sum = sum.add(e.getAmount());
            }
        }
        return sum;
    }
    
    @Override
    public List<Expense> getListExpenses(Calendar initDate,Calendar finalDate) {
        List<Expense> listExpenseMonth = new ArrayList<Expense>();
        for (Expense e : expenses) {
            if (e.occursBetweenDates(initDate, finalDate)) {
                listExpenseMonth.add(e);
            }
        }
        return listExpenseMonth;
    }

    @Override
    public List<Expense> getAll() {
        return expenses;
    }

    @Override
    public BigDecimal getTotal() {
        BigDecimal total = new BigDecimal(0.0);
        for(Expense ex : expenses){
            total = total.add(ex.getAmount());
        }
        return total;
    }
    
}
