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
public class InventarioProducto {
    
    private String referencia;
    private String descripcion;
    private String cantidad;
    private double precio;

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public InventarioProducto(String referencia, String descripcion, String cantidad, double precio) {
        this.referencia = referencia;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }
}
