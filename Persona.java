/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Claudia Pineda
 */
@Entity
@Table (name = "persona")
public class Persona implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersona;
    
    @Column(name = "nombre")
    private String nombrePer;
    
    @Column(name = "apellido")
    private  String apellidoPer;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "fechaNacimiento")
    private Date fechaNaci;
    
    @Column(name = "dui")
    private  String dui;
    
    @Column(name = "nit")
    private  String nit;
    
    @Column(name = "telefono")
    private  String telPersona;
    
    @Column(name = "direccion")
    private  String direccPersona;
    
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne
    private  Usuario usuario;

   @JoinColumn(name = "idSucursal", referencedColumnName = "idSucursal")
   @ManyToOne
   private Sucursal sucursal;

    public Persona() {
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombrePer() {
        return nombrePer;
    }

    public void setNombrePer(String nombrePer) {
        this.nombrePer = nombrePer;
    }

    public String getApellidoPer() {
        return apellidoPer;
    }

    public void setApellidoPer(String apellidoPer) {
        this.apellidoPer = apellidoPer;
    }

    public Date getFechaNaci() {
        return fechaNaci;
    }

    public void setFechaNaci(Date fechaNaci) {
        this.fechaNaci = fechaNaci;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelPersona() {
        return telPersona;
    }

    public void setTelPersona(String telPersona) {
        this.telPersona = telPersona;
    }

    public String getDireccPersona() {
        return direccPersona;
    }

    public void setDireccPersona(String direccPersona) {
        this.direccPersona = direccPersona;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.idPersona;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.idPersona != other.idPersona) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }

   
   
    
}
