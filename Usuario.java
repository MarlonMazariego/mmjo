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
@Table(name = "usuario")
public class Usuario implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    
    @Column(name = "usuario")
    private  String user;
    
    
    @Column(name = "pass")
    private  String pass;
    
    @Column(name = "idEstado")
    private  int idEstado;
    
    @JoinColumn(name = "idRol", referencedColumnName = "idRol")
    @ManyToOne
    private  Rol rol;

    public Usuario() {
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.idUser;
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
        final Usuario other = (Usuario) obj;
        if (this.idUser != other.idUser) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUser=" + idUser + '}';
    }
    
    
}
