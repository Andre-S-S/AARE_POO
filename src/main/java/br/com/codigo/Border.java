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
public class Border {
    
    public String flavorBorder;
    public double priceBorder;
    public int inform = 1;
    
    public String valueAdditionalEdge(int typeBorder) {
        if (typeBorder == 1) {
            this.flavorBorder = "Cheddar";
            this.priceBorder = 0.00;
        }
        
        if (typeBorder == 2) {
            this.flavorBorder = "Catupiry";
            this.priceBorder = 0.00;
        }
        
        if (typeBorder == 3) {
            this.flavorBorder = "½ Nutella ½ Doce de Leite";
            this.priceBorder = 3.00;
        }
        
        if (typeBorder == 4) {
            this.flavorBorder = "Nutella";
            this.priceBorder = 2.00;
        }
        return this.flavorBorder;
    }
}