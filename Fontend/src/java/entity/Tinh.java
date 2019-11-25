/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ntd27
 */
@Entity
@Table(name = "Tinh")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tinh.findAll", query = "SELECT t FROM Tinh t")
    , @NamedQuery(name = "Tinh.findByMaTinh", query = "SELECT t FROM Tinh t WHERE t.maTinh = :maTinh")
    , @NamedQuery(name = "Tinh.findByTenTinh", query = "SELECT t FROM Tinh t WHERE t.tenTinh = :tenTinh")})
public class Tinh implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "MaTinh")
    private String maTinh;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "TenTinh")
    private String tenTinh;

    public Tinh() {
    }

    public Tinh(String maTinh) {
        this.maTinh = maTinh;
    }

    public Tinh(String maTinh, String tenTinh) {
        this.maTinh = maTinh;
        this.tenTinh = tenTinh;
    }

    public String getMaTinh() {
        return maTinh;
    }

    public void setMaTinh(String maTinh) {
        this.maTinh = maTinh;
    }

    public String getTenTinh() {
        return tenTinh;
    }

    public void setTenTinh(String tenTinh) {
        this.tenTinh = tenTinh;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maTinh != null ? maTinh.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tinh)) {
            return false;
        }
        Tinh other = (Tinh) object;
        if ((this.maTinh == null && other.maTinh != null) || (this.maTinh != null && !this.maTinh.equals(other.maTinh))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tinh[ maTinh=" + maTinh + " ]";
    }
    
}
