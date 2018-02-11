package co.com.sirensaMotor.objetos.interno;
// Generated 12/01/2018 05:29:16 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Tblparametros generated by hbm2java
 */
public class Tblparametros  implements java.io.Serializable {


     private BigDecimal id;
     private String descripcion;
     private String abreviatura;
     private Set tblparametrosdetalles = new HashSet(0);

    public Tblparametros() {
    }

	
    public Tblparametros(BigDecimal id, String abreviatura) {
        this.id = id;
        this.abreviatura = abreviatura;
    }
    public Tblparametros(BigDecimal id, String descripcion, String abreviatura, Set tblparametrosdetalles) {
       this.id = id;
       this.descripcion = descripcion;
       this.abreviatura = abreviatura;
       this.tblparametrosdetalles = tblparametrosdetalles;
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getAbreviatura() {
        return this.abreviatura;
    }
    
    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }
    public Set getTblparametrosdetalles() {
        return this.tblparametrosdetalles;
    }
    
    public void setTblparametrosdetalles(Set tblparametrosdetalles) {
        this.tblparametrosdetalles = tblparametrosdetalles;
    }




}

