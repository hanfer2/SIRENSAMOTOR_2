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
public class DetallePedido {
    private int  id;
    private String numero_Pedido;
    private String producto;
    private int cantidad;

    public DetallePedido(int id, String numero_Pedido, String producto, int cantidad) {
        this.id = id;
        this.numero_Pedido = numero_Pedido;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero_Pedido() {
        return numero_Pedido;
    }

    public void setNumero_Pedido(String numero_Pedido) {
        this.numero_Pedido = numero_Pedido;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
