package co.com.sirensaMotor.objetos.interno;
// Generated 12/01/2018 05:29:16 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Tblinventario generated by hbm2java
 */
public class Tblinventario  implements java.io.Serializable {


     private BigDecimal id;
     private Tblusuario tblusuario;
     private Tblproducto tblproducto;
     private BigDecimal cantidad;

    public Tblinventario() {
    }

	
    public Tblinventario(BigDecimal id, Tblproducto tblproducto, BigDecimal cantidad) {
        this.id = id;
        this.tblproducto = tblproducto;
        this.cantidad = cantidad;
    }
    public Tblinventario(BigDecimal id, Tblusuario tblusuario, Tblproducto tblproducto, BigDecimal cantidad) {
       this.id = id;
       this.tblusuario = tblusuario;
       this.tblproducto = tblproducto;
       this.cantidad = cantidad;
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public Tblusuario getTblusuario() {
        return this.tblusuario;
    }
    
    public void setTblusuario(Tblusuario tblusuario) {
        this.tblusuario = tblusuario;
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

