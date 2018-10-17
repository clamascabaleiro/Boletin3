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
public class Consumo {
    
    private double km;
    private double litros;
    private double vMed;
    private double pGas;
    private double tiempo;
  
    
  public Consumo(){

    }
  
  public Consumo(double a, double b, double c, double d){
      
      km = a;
      litros = b;
      vMed = c;
      pGas = d;
}
  public void setKms (double a){
      
      km = a;
  }
  
  public double getKms (){
      
      return km;
  }
  
  public void setLitros (double b){
      
      litros = b;
  }
  
  public double getLitros (){
      
      return litros;
  }
  
  public void setvMed (double c){
      
      vMed = c;
  }
  
  public double getvMed (){
      
      return vMed;
  }
  
  public void setpGas (double d){
      
      pGas = d;
  }
  
  public double getpGas (){
      
      return pGas;
  }
 
  public void setTiempo (double tiempo){
      
      this.tiempo = tiempo;
  }
  public double getTiempo (){
      
      return km/tiempo;
  }
  
  public void consumoMedio (){
      double consumoMedio;
      consumoMedio = litros*100/km;
  }
  
  public void consumoEuros (){
      double consumoEuros;
      consumoEuros = litros*100/km*pGas;
  }
}

