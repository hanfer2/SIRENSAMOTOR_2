package co.com.sirensaMotor.objetos.interno;
// Generated 12/01/2018 05:29:16 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Tbldetallepedido generated by hbm2java
 */
public class Tbldetallepedido  implements java.io.Serializable {


     private BigDecimal id;
     private Tblpedido tblpedido;
     private Tblproducto tblproducto;
     private BigDecimal cantidad;

    public Tbldetallepedido() {
    }

    public Tbldetallepedido(BigDecimal id, Tblpedido tblpedido, Tblproducto tblproducto, BigDecimal cantidad) {
       this.id = id;
       this.tblpedido = tblpedido;
       this.tblproducto = tblproducto;
       this.cantidad = cantidad;
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public Tblpedido getTblpedido() {
        return this.tblpedido;
    }
    
    public void setTblpedido(Tblpedido tblpedido) {
        this.tblpedido = tblpedido;
    }
    public Tblproducto getTblproducto() {
        return this.tblproducto;
    }
    
    public void setTblproducto(Tblproducto tblproducto) {
        this.tblproducto = tblproducto;
    }
    public BigDecimal getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }




}

