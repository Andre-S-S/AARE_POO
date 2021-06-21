/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.codigo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Drink {
    
    public List<String> drinks = new ArrayList();
    public double valueDrink;
    public int inform = 1;
    
    public ArrayList addDrink(int typeDrink) {
        if (typeDrink == 1) {
            this.drinks.add("Coca Cola 2 LT");
            this.valueDrink += 9.50;
        }
        
        if (typeDrink == 2) {
            this.drinks.add("Coca Cola 2 LT");
            this.valueDrink += 6.50;
        }
        
        if (typeDrink == 3) {
            this.drinks.add("Coca Cola 2 LT");
            this.valueDrink += 12.50;
        }
        
        if (typeDrink == 3) {
            this.drinks.add("Coca Cola 2 LT");
            this.valueDrink += 3.50;
        }
        return (ArrayList) this.drinks;
    }
}
