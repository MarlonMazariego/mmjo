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
@Table(name = "razon")
public class Razon implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  int idRazon;
    
    @Column(name = "razon")
    private  String razon;
    
    @Column(name = "idEstado")
    private  int isEstado;

    public Razon() {
    }

    public int getIdRazon() {
        return idRazon;
    }

    public void setIdRazon(int idRazon) {
        this.idRazon = idRazon;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public int getIsEstado() {
        return isEstado;
    }

    public void setIsEstado(int isEstado) {
        this.isEstado = isEstado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.idRazon;
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
        final Razon other = (Razon) obj;
        if (this.idRazon != other.idRazon) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Razon{" + "idRazon=" + idRazon + '}';
    }
    
    
    
}
