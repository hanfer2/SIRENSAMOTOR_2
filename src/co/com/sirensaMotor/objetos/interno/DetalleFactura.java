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
public class DetalleFactura {
    
    private int id;
    private int idFactura;
    private String producto;
    private double valor_Unitario;
    private double iva_Unitario;
    private int cantidad;
    private double  descuento;
    private double total;

    public DetalleFactura(int id, int idFactura, String producto, double valor_Unitario, double iva_Unitario, int cantidad, double descuento, double total) {
        this.id = id;
        this.idFactura = idFactura;
        this.producto = producto;
        this.valor_Unitario = valor_Unitario;
        this.iva_Unitario = iva_Unitario;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getValor_Unitario() {
        return valor_Unitario;
    }

    public void setValor_Unitario(double valor_Unitario) {
        this.valor_Unitario = valor_Unitario;
    }

    public double getIva_Unitario() {
        return iva_Unitario;
    }

    public void setIva_Unitario(double iva_Unitario) {
        this.iva_Unitario = iva_Unitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}

