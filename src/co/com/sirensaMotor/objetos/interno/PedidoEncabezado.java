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
public class PedidoEncabezado {
    
        private int id;
        private String nit;
        private Cliente cliente;
        private String razonSocial;
        private String razonComercial;
        private String telefono;
        private String ciudad;

    public PedidoEncabezado(int id, String nit, Cliente cliente, String razonSocial, String razonComercial, String telefono, String ciudad) {
        this.id = id;
        this.nit = nit;
        this.cliente = cliente;
        this.razonSocial = razonSocial;
        this.razonComercial = razonComercial;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setRazonComercial(String razonComercial) {
        this.razonComercial = razonComercial;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
        
        
}
