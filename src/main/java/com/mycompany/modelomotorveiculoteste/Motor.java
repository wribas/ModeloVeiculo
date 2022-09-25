package com.mycompany.modelomotorveiculoteste;

/**
 *
 * @author walterribas
 */
public class Motor {
    private int qtdPist;
    private int potencia;
    
    // constructor
    public Motor(){
    }
  
    // getters and setters
    
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getQtdPist() {
        return qtdPist;
    }

    public void setQtdPist(int qtdPist) {
        this.qtdPist = qtdPist;
    }
}
