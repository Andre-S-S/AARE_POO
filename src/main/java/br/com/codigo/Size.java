/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.codigo;

/**
 *
 * @author andre
 */
public class Size {
    
    public String size;
    public int qtdFlavor;
    public double priceBorderless;
    public int inform = 1;
    public double priceWithEdge;
    
    public int chooseSize(String sizePizza) {
        if (sizePizza.equalsIgnoreCase("Gigante")) {
            this.qtdFlavor = 5;
            this.size = "Gigante";
            this.priceBorderless = 75.00;
            this.priceWithEdge = 80.00;
        }
        
        if (sizePizza.equalsIgnoreCase("Fam�lia")) {
            this.qtdFlavor = 5;
            this.size = "Fam�lia";
            this.priceBorderless = 66.00;
            this.priceWithEdge = 69.50;
        }
        
        if (sizePizza.equalsIgnoreCase("M�dia")) {
            this.qtdFlavor = 5;
            this.size = "M�dia";
            this.priceBorderless = 52.00;
            this.priceWithEdge = 56.50;
        }
        
        if (sizePizza.equalsIgnoreCase("Pequena")) {
            this.qtdFlavor = 5;
            this.size = "Pequena";
            this.priceBorderless = 42.00;
            this.priceWithEdge = 44.50;
        }
        
        if (sizePizza.equalsIgnoreCase("Broto")) {
            this.qtdFlavor = 5;
            this.size = "Broto";
            this.priceBorderless = 28.00;
            this.inform = 2;
        }
        return this.qtdFlavor;
    }
}
