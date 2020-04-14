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
@Table(name = "registro")
public class Registro implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int  idRegistro;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha")
    private  Date fecha;
    
    @Temporal(TemporalType.TIME)
    @Column(name = "hora")
    private Date hora;
    
    @JoinColumn(name = "idInventario", referencedColumnName = "idInventario")
    @ManyToOne
    private  Inventario inventario;
    
    @JoinColumn(name = "idPersona", referencedColumnName = "idPersona")
    @ManyToOne
    private Persona persona;
    
    @Column(name = "cantidad")
    private  int  cantidad;

    public Registro() {
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.idRegistro;
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
        final Registro other = (Registro) obj;
        if (this.idRegistro != other.idRegistro) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Registro{" + "idRegistro=" + idRegistro + '}';
    }
    
    
    
}
