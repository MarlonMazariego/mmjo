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
@Table(name = "tipoRegistro")
public class TipoRegistro implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idTipoRegistro;
    
    @Column(name = "tipoRegistro")
    private  String tipoRegistro;

    public TipoRegistro() {
    }

    public int getIdTipoRegistro() {
        return idTipoRegistro;
    }

    public void setIdTipoRegistro(int idTipoRegistro) {
        this.idTipoRegistro = idTipoRegistro;
    }

    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.idTipoRegistro;
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
        final TipoRegistro other = (TipoRegistro) obj;
        if (this.idTipoRegistro != other.idTipoRegistro) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TipoRegistro{" + "idTipoRegistro=" + idTipoRegistro + '}';
    }
    
    
}
