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
import javax.persistence.Table;

/**
 *
 * @author Claudia Pineda
 */
@Entity
@Table(name = "proveedor")
public class Proveedor implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idProveedor;
    
    @Column(name = "proveedor")
    private String proveedor;
    
    @Column(name = "telefonoProveedor")
    private  String telProveedor;
    
    @Column(name = "direccionProveedor")
    private  String direccProveedor;
    
    @Column(name = "idEstado")
    private  int idEstado;

    public Proveedor() {
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getTelProveedor() {
        return telProveedor;
    }

    public void setTelProveedor(String telProveedor) {
        this.telProveedor = telProveedor;
    }

    public String getDireccProveedor() {
        return direccProveedor;
    }

    public void setDireccProveedor(String direccProveedor) {
        this.direccProveedor = direccProveedor;
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
        hash = 11 * hash + this.idProveedor;
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
        final Proveedor other = (Proveedor) obj;
        if (this.idProveedor != other.idProveedor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + '}';
    }
    
    
}
