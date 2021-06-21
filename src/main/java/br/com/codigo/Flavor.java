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
public class Flavor {
   
    public List<String> flavors = new ArrayList();
    public double additionalValue;
    
    public ArrayList addFlavor(String flavorPizza) {
        if (flavorPizza.equalsIgnoreCase("5 Queijos")) {
            this.flavors.add("5 Queijos");
            this.additionalValue = 0.00;
        }
        
         if (flavorPizza.equalsIgnoreCase("Frango Catupiry")) {
            this.flavors.add("Frango Catupiry");
            this.additionalValue = 0.00;
        }

        if (flavorPizza.equalsIgnoreCase("Calabresa")) {
            this.flavors.add("Calabresa");
            this.additionalValue = 0.00;
        }
        
        if (flavorPizza.equalsIgnoreCase("Chocolate")) {
            this.flavors.add("Chocolate");
            this.additionalValue = 0.00;
        }
        
        if (flavorPizza.equalsIgnoreCase("Prestígio")){
            this.flavors.add("Prestígio");
            this.additionalValue = 0.00;
        }
        
        if (flavorPizza.equalsIgnoreCase("Abacaxi com Canela")) {
            this.flavors.add("Abacaxi com Canela");
            this.additionalValue = 0.00;
        }
        
        if (flavorPizza.equalsIgnoreCase("Cheddar")) {
            this.flavors.add("Cheddar");
            this.additionalValue += 3.50;
        }
        
        if (flavorPizza.equalsIgnoreCase("Salmão com alcaparras")) {
            this.flavors.add("Salmão com alcaparras");
            this.additionalValue += 4.00;
        }
        
        if (flavorPizza.equalsIgnoreCase("Camarão")) {
            this.flavors.add("Camarão");
            this.additionalValue += 4.50;
        }
        
        return (ArrayList) this.flavors;
    }
    
}