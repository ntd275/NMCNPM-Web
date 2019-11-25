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
@Table(name = "QuanHuyen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QuanHuyen.findAll", query = "SELECT q FROM QuanHuyen q")
    , @NamedQuery(name = "QuanHuyen.findByMaQH", query = "SELECT q FROM QuanHuyen q WHERE q.maQH = :maQH")
    , @NamedQuery(name = "QuanHuyen.findByTenQuanHuyen", query = "SELECT q FROM QuanHuyen q WHERE q.tenQuanHuyen = :tenQuanHuyen")
    , @NamedQuery(name = "QuanHuyen.findByMaTinh", query = "SELECT q FROM QuanHuyen q WHERE q.maTinh = :maTinh")})
public class QuanHuyen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "MaQH")
    private String maQH;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "TenQuanHuyen")
    private String tenQuanHuyen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "MaTinh")
    private String maTinh;

    public QuanHuyen() {
    }

    public QuanHuyen(String maQH) {
        this.maQH = maQH;
    }

    public QuanHuyen(String maQH, String tenQuanHuyen, String maTinh) {
        this.maQH = maQH;
        this.tenQuanHuyen = tenQuanHuyen;
        this.maTinh = maTinh;
    }

    public String getMaQH() {
        return maQH;
    }

    public void setMaQH(String maQH) {
        this.maQH = maQH;
    }

    public String getTenQuanHuyen() {
        return tenQuanHuyen;
    }

    public void setTenQuanHuyen(String tenQuanHuyen) {
        this.tenQuanHuyen = tenQuanHuyen;
    }

    public String getMaTinh() {
        return maTinh;
    }

    public void setMaTinh(String maTinh) {
        this.maTinh = maTinh;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maQH != null ? maQH.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuanHuyen)) {
            return false;
        }
        QuanHuyen other = (QuanHuyen) object;
        if ((this.maQH == null && other.maQH != null) || (this.maQH != null && !this.maQH.equals(other.maQH))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.QuanHuyen[ maQH=" + maQH + " ]";
    }
    
}
