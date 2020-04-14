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
@Table(name = "inventario")
public class Inventario implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int  idInventario;
    
    @Column(name = "cantidad")
    private  int  cantidad;
    
    @JoinColumn(name = "idArticulo", referencedColumnName = "idArticulo")
    @ManyToOne
    private  Articulo articulo;
    
    @JoinColumn(name = "idSucursal", referencedColumnName = "idSucursal")
    private  Sucursal sucursal;

    public Inventario() {
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
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
        hash = 97 * hash + this.idInventario;
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
        final Inventario other = (Inventario) obj;
        if (this.idInventario != other.idInventario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventario{" + "idInventario=" + idInventario + '}';
    }
    
    
    
}
