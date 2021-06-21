/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.codigo;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Order {
   
    private double valueTotal;
    private double value;
    
    public void addOrder() {
        Size size = new Size();
        Flavor flavor = new Flavor();
        Border border = new Border();
        Drink drink = new Drink();
        
        size.chooseSize(JOptionPane.showInputDialog("Cartápio: \n"
                                + "Tamanho  Qnt Sabores  Valor S/Borda  Valor C/ Borda \n"
                                + "Gigante       5           R$75,00        R$80,00  \n"
                                + "Família       4           R$66,00        R$69,50 \n"
                                + "Média         3           R$52,00        R$56,50 \n"
                                + "Pequena       3           R$42,00        R$44,50 \n"
                                + "Broto         2           R$28,00     Não disponível \n"
                                + "Tamanho da Pizza? "));
        
        for (int i = 0; i < size.qtdFlavor; i++) {
            flavor.addFlavor(JOptionPane.showInputDialog("Cartápio de Sabore: \n"
                            + "Sabores                Valor Adicional \n"
                            + "5 queijos                   R$0,00\n"
                            + "Frango catupiry             R$0,00\n"
                            + "Calabresa                   R$0,00\n"
                            + "Chocolate                   R$0,00\n"
                            + "Prestígio                   R$0,00\n"
                            + "Abacaxi com Canela          R$0,00\n"
                            + "Cheddar                     R$3,50 \n"
                            + "Salmão com Alcaparras       R$4,00 \n"
                            + "Camarão                     R$4,50 \n"
                            + "Informe o " + i + "º sabor:"));       
        }
        
        if (size.inform == 1) {
            int condition= new Integer(JOptionPane.showInputDialog("Borda na pizza? ([1]Sim / [2]Não)"));
            switch (condition) {
            case 1:
                    border.valueAdditionalEdge(new Integer(JOptionPane.showInputDialog("Cartápio da Borda \n"
                                                 + "Sabor da borda                          Valor Adicional \n"
					         + "[1] - Cheddar                                   - \n"
					         + "[2] - Catupiry                                  - \n"
					         + "[3] - 1/2 Nutella 1/2 Doce de Leite          R$3,00 \n"
					         + "[4] - Nutella                                R$2,00 \n"
					         + "Infome o sabor da borda:")));

                    border.inform = 2;
                    break;        
            case 2:
                    break;
            }
        }
        
        if (border.inform == 1) {
            this.value = size.priceWithEdge;
        }
        
        if (border.inform == 2) {
            this.value = size.priceBorderless;
        }
        
        if (drink.inform == 1) {
            int conditionOne = new Integer(JOptionPane.showInputDialog("Adicionar bebida? ([1]Sim / [2]Não)"));
            switch (conditionOne) {
            case 1:
                    drink.addDrink(new Integer(JOptionPane.showInputDialog("Cartápio de Bebida \n"
                                                 + "Sabor da borda                     Valor Adicional \n"
					         + "[1] - Coca Cola 2 LT                      R$9,50\n"
					         + "[2] - Cerveja Heineken 330 ML             R$6,50\n"
					         + "[3] - Suco Pratz 900 ML                   R$12,50 \n"
					         + "[4] - Agua Mineral 600 ML                 R$3,50 \n"
					         + "Infome a bebida:")));
                    break;     
            case 2:
                    drink.inform -= 1;
                    break;
            }
        }

        this.valueTotal = this.value + flavor.additionalValue + border.priceBorder + drink.valueDrink;
        
        JOptionPane.showMessageDialog(null,"Tamanho da Pizza: " + size.size + "\n"
                                      + "Sabores Escolhidos: " + flavor.flavors + "\n"
                                      + "Borda Escolhida: " + border.flavorBorder + "\n"
                                      + "Bebidas Escolhida:" + drink.drinks + "\n"
                                      + "Total Geral: R$" + this.valueTotal);
    }
    
}