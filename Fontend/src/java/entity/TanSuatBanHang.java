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
@Table(name = "TanSuatBanHang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TanSuatBanHang.findAll", query = "SELECT t FROM TanSuatBanHang t")
    , @NamedQuery(name = "TanSuatBanHang.findByIdsp", query = "SELECT t FROM TanSuatBanHang t WHERE t.idsp = :idsp")
    , @NamedQuery(name = "TanSuatBanHang.findBySoLuong", query = "SELECT t FROM TanSuatBanHang t WHERE t.soLuong = :soLuong")
    , @NamedQuery(name = "TanSuatBanHang.findByTanSuat", query = "SELECT t FROM TanSuatBanHang t WHERE t.tanSuat = :tanSuat")})
public class TanSuatBanHang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "IDSP")
    private String idsp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SoLuong")
    private int soLuong;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TanSuat")
    private double tanSuat;

    public TanSuatBanHang() {
    }

    public TanSuatBanHang(String idsp) {
        this.idsp = idsp;
    }

    public TanSuatBanHang(String idsp, int soLuong, double tanSuat) {
        this.idsp = idsp;
        this.soLuong = soLuong;
        this.tanSuat = tanSuat;
    }

    public String getIdsp() {
        return idsp;
    }

    public void setIdsp(String idsp) {
        this.idsp = idsp;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getTanSuat() {
        return tanSuat;
    }

    public void setTanSuat(double tanSuat) {
        this.tanSuat = tanSuat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsp != null ? idsp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TanSuatBanHang)) {
            return false;
        }
        TanSuatBanHang other = (TanSuatBanHang) object;
        if ((this.idsp == null && other.idsp != null) || (this.idsp != null && !this.idsp.equals(other.idsp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TanSuatBanHang[ idsp=" + idsp + " ]";
    }
    
}
