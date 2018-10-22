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
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    
    public Consumo(){}
    public Consumo(float km, float litros, float vMed, float pGas){
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }
    
    public float getTempo(){
        float tempo = km / vMed;
        return tempo;
    }
    public float consumoMedio(){
        float cMed = litros / km * 100;
        return cMed;
    }
    public float consumoEuros(){
        float cEuros = pGas / this.consumoMedio() * 100;
        return cEuros;
    }
    public float getKm(){
        return km;
    }
    public float getLitros(){
        return litros;
    }
    public float getVmed(){
        return vMed;
    }
    public float getPgas(){
        return pGas;
    }
    public void setKm(float km){
        this.km = km;
    }
    public void setLitros(float litros){
        this.litros = litros;
    }
    public void setVmed(float vMed){
        this.vMed = vMed;
    }
    public void setPgas(float pGas){
        this.pGas = pGas;
    }
    
}


