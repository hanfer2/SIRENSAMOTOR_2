package co.com.sirensaMotor.objetos.interno;
// Generated 12/01/2018 05:29:16 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Tblcliente generated by hbm2java
 */
public class Tblcliente  implements java.io.Serializable {


     private BigDecimal id;
     private Tblusuario tblusuario;
     private Tblparametrosdetalle tblparametrosdetalle;
     private String identificacion;
     private String direccion;
     private String nombrecliente;
     private String telefono;
     private String calular;
     private String email;
     private Set tblfacturas = new HashSet(0);
     private Set tblpedidos = new HashSet(0);

    public Tblcliente() {
    }

	
    public Tblcliente(BigDecimal id, Tblusuario tblusuario) {
        this.id = id;
        this.tblusuario = tblusuario;
    }
    public Tblcliente(BigDecimal id, Tblusuario tblusuario, Tblparametrosdetalle tblparametrosdetalle, String identificacion, String direccion, String nombrecliente, String telefono, String calular, String email, Set tblfacturas, Set tblpedidos) {
       this.id = id;
       this.tblusuario = tblusuario;
       this.tblparametrosdetalle = tblparametrosdetalle;
       this.identificacion = identificacion;
       this.direccion = direccion;
       this.nombrecliente = nombrecliente;
       this.telefono = telefono;
       this.calular = calular;
       this.email = email;
       this.tblfacturas = tblfacturas;
       this.tblpedidos = tblpedidos;
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
    public Tblparametrosdetalle getTblparametrosdetalle() {
        return this.tblparametrosdetalle;
    }
    
    public void setTblparametrosdetalle(Tblparametrosdetalle tblparametrosdetalle) {
        this.tblparametrosdetalle = tblparametrosdetalle;
    }
    public String getIdentificacion() {
        return this.identificacion;
    }
    
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getNombrecliente() {
        return this.nombrecliente;
    }
    
    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCalular() {
        return this.calular;
    }
    
    public void setCalular(String calular) {
        this.calular = calular;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set getTblfacturas() {
        return this.tblfacturas;
    }
    
    public void setTblfacturas(Set tblfacturas) {
        this.tblfacturas = tblfacturas;
    }
    public Set getTblpedidos() {
        return this.tblpedidos;
    }
    
    public void setTblpedidos(Set tblpedidos) {
        this.tblpedidos = tblpedidos;
    }




}


