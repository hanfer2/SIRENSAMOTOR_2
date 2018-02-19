/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sirensaMotor.objetos.externo;

/**
 *
 * @author nicol
 */
public class ObjetoLlaveValor {
    
    private String llave;
    private String valor;

    public ObjetoLlaveValor() {
    }
    
    public ObjetoLlaveValor (String llave, String valor)
    {
        this.llave = llave;
        this.valor = valor;
    }

    public String getLlave() {
        return llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
}
