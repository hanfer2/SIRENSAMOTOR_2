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
public class Factura {
    private int id;
    private int idProveedor;
    private int idCliente;
    private String numeroFactura;
  //  private DateTime fechaFactura;
    private int tipoIdentificacionVendedor;
    private String identificacionVendedor;
    private String nombreVendedor;
    private double subtotal;
    private double iva;
    private double descuentos;
    private double total;
  //  private DateTime fechaCreacion;
    private String tipoFactura;
 //   private List<DetalleFactura> listaDetalleFactura;
    private String estado;
}
