/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sirensaMotor.objetos.interno;

/**
 *
 * @author nicol
 */
public class ParametroDetalle {
    private int id;
    private int idParamtro;
    private String descripcion;
    private String valor;
    private String abreviatura;

    public ParametroDetalle(int id, int idParamtro, String descripcion, String valor, String abreviatura) {
        this.id = id;
        this.idParamtro = idParamtro;
        this.descripcion = descripcion;
        this.valor = valor;
        this.abreviatura = abreviatura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdParamtro() {
        return idParamtro;
    }

    public void setIdParamtro(int idParamtro) {
        this.idParamtro = idParamtro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }
    
    
}
