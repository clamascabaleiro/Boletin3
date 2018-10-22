/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_1;

/**
 *
 * @author clamascabaleiro
 */
public class Boletin3_1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        Consumo consumo1 = new Consumo();
        consumo1.setLitros(50f);
        consumo1.setPgas(1.57f);
        Consumo consumo2 = new Consumo(451f, 65.7f, 74.3f, 1.57f);
        System.out.println("consumo medio = " + consumo2.consumoMedio());
        consumo2.setLitros(56.2f);
        System.out.println("velocidade media" + consumo2.getVmed());
    }
       
}
