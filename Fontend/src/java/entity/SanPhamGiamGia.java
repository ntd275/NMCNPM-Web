/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ntd27
 */
@Entity
@Table(name = "SanPhamGiamGia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SanPhamGiamGia.findAll", query = "SELECT s FROM SanPhamGiamGia s")
    , @NamedQuery(name = "SanPhamGiamGia.findByIdsp", query = "SELECT s FROM SanPhamGiamGia s WHERE s.idsp = :idsp")
    , @NamedQuery(name = "SanPhamGiamGia.findByHeSoGiam", query = "SELECT s FROM SanPhamGiamGia s WHERE s.heSoGiam = :heSoGiam")
    , @NamedQuery(name = "SanPhamGiamGia.findByThoiGianBatDau", query = "SELECT s FROM SanPhamGiamGia s WHERE s.thoiGianBatDau = :thoiGianBatDau")
    , @NamedQuery(name = "SanPhamGiamGia.findByThoiGianKetThuc", query = "SELECT s FROM SanPhamGiamGia s WHERE s.thoiGianKetThuc = :thoiGianKetThuc")})
public class SanPhamGiamGia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "IDSP")
    private String idsp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HeSoGiam")
    private int heSoGiam;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ThoiGianBatDau")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thoiGianBatDau;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ThoiGianKetThuc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thoiGianKetThuc;

    public SanPhamGiamGia() {
    }

    public SanPhamGiamGia(String idsp) {
        this.idsp = idsp;
    }

    public SanPhamGiamGia(String idsp, int heSoGiam, Date thoiGianBatDau, Date thoiGianKetThuc) {
        this.idsp = idsp;
        this.heSoGiam = heSoGiam;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public String getIdsp() {
        return idsp;
    }

    public void setIdsp(String idsp) {
        this.idsp = idsp;
    }

    public int getHeSoGiam() {
        return heSoGiam;
    }

    public void setHeSoGiam(int heSoGiam) {
        this.heSoGiam = heSoGiam;
    }

    public Date getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(Date thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public Date getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(Date thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
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
        if (!(object instanceof SanPhamGiamGia)) {
            return false;
        }
        SanPhamGiamGia other = (SanPhamGiamGia) object;
        if ((this.idsp == null && other.idsp != null) || (this.idsp != null && !this.idsp.equals(other.idsp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.SanPhamGiamGia[ idsp=" + idsp + " ]";
    }
    
}
