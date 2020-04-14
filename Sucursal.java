/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
 *
 * @author Claudia Pineda
 */
@Entity
@Table(name = "sucursal")
public class Sucursal implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idSucursal;
    
    @Column(name = "sucursal")
    private  String sucursal;
    
    @Column(name = "telefonoSucursal")
    private  String telSucursal;
    
    @Column(name = "direccionSucursal")
    private  String direccSucursal;
    
    @Column(name = "idEstado")
    private int idEstado;

    public Sucursal() {
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getTelSucursal() {
        return telSucursal;
    }

    public void setTelSucursal(String telSucursal) {
        this.telSucursal = telSucursal;
    }

    public String getDireccSucursal() {
        return direccSucursal;
    }

    public void setDireccSucursal(String direccSucursal) {
        this.direccSucursal = direccSucursal;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.idSucursal;
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
        final Sucursal other = (Sucursal) obj;
        if (this.idSucursal != other.idSucursal) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "idSucursal=" + idSucursal + '}';
    }
    
    
}
