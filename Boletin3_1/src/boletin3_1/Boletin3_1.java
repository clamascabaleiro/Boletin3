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
        Consumo coche1 = new Consumo();
        coche1.setLitros(50f);
        coche1.setPgas(1.57f);
        Consumo coche2 = new Consumo(451f, 65.7f, 74.3f, 1.57f);
        System.out.println("consumo medio = " + coche2.consumoMedio());
        coche2.setLitros(56.2f);
        System.out.println("velocidade media" + coche2.getVmed());
    }
       
}
