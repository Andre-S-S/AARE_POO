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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Order order = new Order();
        Size size = new Size();
        Flavor flavor = new Flavor();
        Border border = new Border();
        Drink drink = new Drink();
        
        order.addOrder();
        
    }
    
}