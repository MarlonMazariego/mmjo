/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Claudia Pineda
 */
@Entity
@Table(name = "bajas")
public class Bajas implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBajas;
    
    @JoinColumn(name = "idInventario", referencedColumnName = "idInventario")
    @ManyToOne
    private  Inventario inventario;
    
    @Column(name = "cantidad")
    private int  cantidad;
    
    @JoinColumn(name = "idRazon", referencedColumnName = "idRazon")
    @ManyToOne
    private  Razon razon;
    
    @Column(name = "comentario")
    private  String comentario;

    public Bajas() {
    }

    public int getIdBajas() {
        return idBajas;
    }

    public void setIdBajas(int idBajas) {
        this.idBajas = idBajas;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Razon getRazon() {
        return razon;
    }

    public void setRazon(Razon razon) {
        this.razon = razon;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.idBajas;
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
        final Bajas other = (Bajas) obj;
        if (this.idBajas != other.idBajas) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bajas{" + "idBajas=" + idBajas + '}';
    }
    
    
}
