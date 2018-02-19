package co.com.sirensaMotor.objetos.interno;
// Generated 12/01/2018 05:29:16 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Tblproducto generated by hbm2java
 */
public class Tblproducto  implements java.io.Serializable {


     private BigDecimal id;
     private Tblusuario tblusuario;
     private String referencia;
     private String descripcion;
     private BigDecimal precio;
     private String presentacion;
     private Set tblinventarios = new HashSet(0);
     private Set tbldevolucions = new HashSet(0);
     private Set tbldetallefacturas = new HashSet(0);
     private Set tbldetallepedidos = new HashSet(0);

    public Tblproducto() {
    }

	
    public Tblproducto(BigDecimal id, String referencia, String descripcion, BigDecimal precio) {
        this.id = id;
        this.referencia = referencia;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public Tblproducto(BigDecimal id, Tblusuario tblusuario, String referencia, String descripcion, BigDecimal precio, String presentacion, Set tblinventarios, Set tbldevolucions, Set tbldetallefacturas, Set tbldetallepedidos) {
       this.id = id;
       this.tblusuario = tblusuario;
       this.referencia = referencia;
       this.descripcion = descripcion;
       this.precio = precio;
       this.presentacion = presentacion;
       this.tblinventarios = tblinventarios;
       this.tbldevolucions = tbldevolucions;
       this.tbldetallefacturas = tbldetallefacturas;
       this.tbldetallepedidos = tbldetallepedidos;
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
    public String getReferencia() {
        return this.referencia;
    }
    
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public BigDecimal getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    public String getPresentacion() {
        return this.presentacion;
    }
    
    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }
    public Set getTblinventarios() {
        return this.tblinventarios;
    }
    
    public void setTblinventarios(Set tblinventarios) {
        this.tblinventarios = tblinventarios;
    }
    public Set getTbldevolucions() {
        return this.tbldevolucions;
    }
    
    public void setTbldevolucions(Set tbldevolucions) {
        this.tbldevolucions = tbldevolucions;
    }
    public Set getTbldetallefacturas() {
        return this.tbldetallefacturas;
    }
    
    public void setTbldetallefacturas(Set tbldetallefacturas) {
        this.tbldetallefacturas = tbldetallefacturas;
    }
    public Set getTbldetallepedidos() {
        return this.tbldetallepedidos;
    }
    
    public void setTbldetallepedidos(Set tbldetallepedidos) {
        this.tbldetallepedidos = tbldetallepedidos;
    }




}

